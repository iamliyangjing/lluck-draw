package com.example.lottery.application.process.res;

import com.example.lottery.domain.strategy.domain.vo.DrawAwardInfo;
import com.example.lotterycommon.Result;

/**
 * @program: lluck-draw
 * @description: 活动抽奖结果
 * @author: lyj
 * @create: 2023-06-05 22:09
 **/
public class DrawProcessResult extends Result {
    private DrawAwardInfo drawAwardInfo;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardInfo drawAwardInfo) {
        super(code, info);
        this.drawAwardInfo = drawAwardInfo;
    }

    public DrawAwardInfo getDrawAwardInfo() {
        return drawAwardInfo;
    }

    public void setDrawAwardInfo(DrawAwardInfo drawAwardInfo) {
        this.drawAwardInfo = drawAwardInfo;
    }
}
