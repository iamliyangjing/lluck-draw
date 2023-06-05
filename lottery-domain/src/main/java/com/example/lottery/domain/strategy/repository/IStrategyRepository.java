package com.example.lottery.domain.strategy.repository;

import com.example.lottery.domain.strategy.domain.aggregates.StrategyRich;
import com.example.lottery.domain.strategy.domain.vo.AwardBriefVO;

import java.util.List;

/**
 * @program: lluck-draw
 * @description: 策略表仓储服务
 * @author: lyj
 * @create: 2023-05-21 10:58
 **/
public interface IStrategyRepository {

    /**
     * 查询策略信息
     *
     * @param strategyId 策略ID
     * @return           策略信息
     */
    StrategyRich queryStrategyRich(Long strategyId);

    /**
     * 查询奖励配置
     *
     * @param awardId   奖励ID
     * @return          奖励信息
     */
    AwardBriefVO queryAwardInfo(String awardId);

    /**
     * 查询无库存奖品
     *
     * @param strategyId 策略ID
     * @return           无库存奖品
     */
    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

}
