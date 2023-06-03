package com.example.lottery.domain.activity.model.aggregates;

import com.example.lottery.domain.activity.model.vo.ActivityVO;
import com.example.lottery.domain.activity.model.vo.AwardVO;
import com.example.lottery.domain.activity.model.vo.StrategyVO;

import java.util.List;

/**
 * @program: lluck-draw
 * @description: 活动配置聚合信息
 * @author: lyj
 * @create: 2023-06-04 00:36
 **/
public class ActivityConfigRich {

    /** 活动配置 */
    private ActivityVO activity;

    /** 策略配置(含策略明细) */
    private StrategyVO strategy;

    /** 奖品配置 */
    private List<AwardVO> awardList;

    public ActivityConfigRich() {
    }

    public ActivityConfigRich(ActivityVO activity, StrategyVO strategy, List<AwardVO> awardList) {
        this.activity = activity;
        this.strategy = strategy;
        this.awardList = awardList;
    }

    public ActivityVO getActivity() {
        return activity;
    }

    public void setActivity(ActivityVO activity) {
        this.activity = activity;
    }

    public StrategyVO getStrategy() {
        return strategy;
    }

    public void setStrategy(StrategyVO strategy) {
        this.strategy = strategy;
    }

    public List<AwardVO> getAwardList() {
        return awardList;
    }

    public void setAwardList(List<AwardVO> awardList) {
        this.awardList = awardList;
    }
}