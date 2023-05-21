package com.example.lottery.domain.award.service.factory;

import com.example.lottery.domain.award.service.goods.IDistributionGoods;
import com.example.lottery.domain.award.service.goods.impl.CouponGoods;
import com.example.lottery.domain.award.service.goods.impl.DescGoods;
import com.example.lottery.domain.award.service.goods.impl.PhysicalGoods;
import com.example.lottery.domain.award.service.goods.impl.RedeemCodeGoods;
import com.example.lotterycommon.Constants;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 23:51
 **/
public class GoodsConfig {

    /** 奖品发放策略组 */
    protected static Map<Integer, IDistributionGoods> goodsMap = new ConcurrentHashMap<>();

    @Resource
    private DescGoods descGoods;

    @Resource
    private RedeemCodeGoods redeemCodeGoods;

    @Resource
    private CouponGoods couponGoods;

    @Resource
    private PhysicalGoods physicalGoods;

    @PostConstruct
    public void init() {
        goodsMap.put(Constants.AwardType.DESC.getCode(), descGoods);
        goodsMap.put(Constants.AwardType.RedeemCodeGoods.getCode(), redeemCodeGoods);
        goodsMap.put(Constants.AwardType.CouponGoods.getCode(), couponGoods);
        goodsMap.put(Constants.AwardType.PhysicalGoods.getCode(), physicalGoods);
    }

}
