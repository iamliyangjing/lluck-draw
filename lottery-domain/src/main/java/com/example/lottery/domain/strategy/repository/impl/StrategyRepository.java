package com.example.lottery.domain.strategy.repository.impl;

import com.example.lottery.dao.IAwardDao;
import com.example.lottery.dao.IStrategyDao;
import com.example.lottery.dao.IStrategyDetailDao;
import com.example.lottery.domain.strategy.domain.aggregates.StrategyRich;
import com.example.lottery.domain.strategy.repository.IStrategyRepository;
import com.example.lottery.po.Award;
import com.example.lottery.po.Strategy;
import com.example.lottery.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 10:58
 **/
@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }

}
