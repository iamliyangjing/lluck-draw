package com.example.lottery.domain.activity.service.partake;

import com.example.lottery.domain.activity.model.req.PartakeReq;
import com.example.lottery.domain.activity.model.vo.ActivityBillVO;
import com.example.lottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * @program: lluck-draw
 * @description: 活动领取模操作，一些通用的数据服务
 * @author: lyj
 * @create: 2023-06-04 22:41
 **/
public class ActivityPartakeSupport {

    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req){
        return activityRepository.queryActivityBill(req);
    }

}
