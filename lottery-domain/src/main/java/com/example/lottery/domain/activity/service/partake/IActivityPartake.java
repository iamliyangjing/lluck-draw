package com.example.lottery.domain.activity.service.partake;

import com.example.lottery.domain.activity.model.req.PartakeReq;
import com.example.lottery.domain.activity.model.res.PartakeResult;

/**
 * @program: lluck-draw
 * @description: 抽奖接口参与活动
 * @author: lyj
 * @create: 2023-06-04 00:44
 **/
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);

}
