package com.example.lottery.domain.strategy.service.algorithm.impl;

import com.example.lottery.domain.strategy.domain.vo.AwardRateVO;
import com.example.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: lluck-draw
 * @description: 必中奖策略抽奖，排掉已经中奖的概率，重新计算中奖范围
 * @author: lyj
 * @create: 2023-05-21 12:06
 **/
@Component("entiretyRateRandomDrawAlgorithm")
public class EntiretyRateRandomDrawAlgorithm extends BaseAlgorithm {

    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {

        BigDecimal differenceDenominator = BigDecimal.ZERO;

        // 排除掉不在抽奖范围的奖品ID集合
        List<AwardRateVO> differenceAwardRateList = new ArrayList<>();
        List<AwardRateVO> awardRateIntervalValList = awardRateInfoMap.get(strategyId);
        for (AwardRateVO awardRateVO : awardRateIntervalValList) {
            String awardId = awardRateVO.getAwardId();
            if (excludeAwardIds.contains(awardId)) {
                continue;
            }
            differenceAwardRateList.add(awardRateVO);
            differenceDenominator = differenceDenominator.add(awardRateVO.getAwardRate());
        }

        // 前置判断：奖品列表为0，返回NULL
        if (differenceAwardRateList.size() == 0) {
            return null;
        }

        // 前置判断：奖品列表为1，直接返回
        if (differenceAwardRateList.size() == 1) {
            return differenceAwardRateList.get(0).getAwardId();
        }

        // 获取随机概率值
        int randomVal = this.generateSecureRandomIntCode(100);

        // 循环获取奖品
        String awardId = null;
        int cursorVal = 0;
        for (AwardRateVO awardRateVO : differenceAwardRateList) {
            int rateVal = awardRateVO.getAwardRate().divide(differenceDenominator, 2, BigDecimal.ROUND_UP).multiply(new BigDecimal(100)).intValue();
            if (randomVal <= (cursorVal + rateVal)) {
                awardId = awardRateVO.getAwardId();
                break;
            }
            cursorVal += rateVal;
        }

        // 返回中奖结果
        return awardId;
    }

}
