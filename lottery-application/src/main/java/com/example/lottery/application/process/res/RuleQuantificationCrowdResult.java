package com.example.lottery.application.process.res;

import com.example.lotterycommon.Result;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-06-07 00:05
 **/
public class RuleQuantificationCrowdResult extends Result {

    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
