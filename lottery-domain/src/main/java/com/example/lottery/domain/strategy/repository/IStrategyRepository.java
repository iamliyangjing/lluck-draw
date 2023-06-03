package com.example.lottery.domain.strategy.repository;

import com.example.lottery.domain.strategy.domain.aggregates.StrategyRich;
import com.example.lottery.domain.strategy.domain.vo.AwardBriefVO;

import java.util.List;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 10:58
 **/
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    AwardBriefVO queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

}
