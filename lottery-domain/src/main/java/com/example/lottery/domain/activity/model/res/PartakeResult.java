package com.example.lottery.domain.activity.model.res;

import com.example.lotterycommon.Result;

/**
 * @program: lluck-draw
 * @description: 活动参与结果
 * @author: lyj
 * @create: 2023-06-04 22:37
 **/
public class PartakeResult extends Result {

    /**
     * 策略ID
     */
    private Long strategyId;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}
