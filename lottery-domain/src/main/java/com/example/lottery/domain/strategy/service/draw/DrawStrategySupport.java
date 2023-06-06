package com.example.lottery.domain.strategy.service.draw;

import com.example.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.example.lottery.domain.strategy.model.vo.AwardBriefVO;
import com.example.lottery.domain.strategy.repository.IStrategyRepository;

import javax.annotation.Resource;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 14:09
 **/
public class DrawStrategySupport extends DrawConfig{


    @Resource
    protected IStrategyRepository strategyRepository;

    /**
     * 查询策略配置信息
     *
     * @param strategyId 策略ID
     * @return 策略配置信息
     */
    protected StrategyRich queryStrategyRich(Long strategyId){
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * 查询奖品详情信息
     *
     * @param awardId 奖品ID
     * @return 中奖详情
     */
    protected AwardBriefVO queryAwardInfoByAwardId(String awardId){
        return strategyRepository.queryAwardInfo(awardId);
    }


}
