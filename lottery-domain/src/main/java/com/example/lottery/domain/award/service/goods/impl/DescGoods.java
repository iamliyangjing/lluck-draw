package com.example.lottery.domain.award.service.goods.impl;

import com.example.lottery.domain.award.model.req.GoodsReq;
import com.example.lottery.domain.award.model.res.DistributionRes;
import com.example.lottery.domain.award.service.goods.DistributionBase;
import com.example.lottery.domain.award.service.goods.IDistributionGoods;
import com.example.lotterycommon.Constants;
import org.springframework.stereotype.Component;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 23:48
 **/
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }


}