package com.example.lottery.interfaces;

import com.example.lotterycommon.Constants;
import com.example.lotterycommon.Result;
import com.example.lottery.dao.IActivityDao;
import com.example.lottery.po.Activity;
import com.example.lottery.rpc.IActivityBooth;
import com.example.lottery.rpc.dto.ActivityDto;
import com.example.lottery.rpc.req.ActivityReq;
import com.example.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-19 22:58
 **/
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

}
