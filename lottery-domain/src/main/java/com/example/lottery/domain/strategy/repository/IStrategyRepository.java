package com.example.lottery.domain.strategy.repository;

import com.example.lottery.domain.strategy.domain.aggregates.StrategyRich;
import com.example.lottery.po.Award;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 10:58
 **/
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

}
