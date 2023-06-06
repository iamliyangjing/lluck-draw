package com.example.lottery.application.process.res;

import com.example.lottery.domain.strategy.model.vo.DrawAwardVO;
import com.example.lotterycommon.Result;

/**
 * @program: lluck-draw
 * @description: 活动抽奖结果
 * @author: lyj
 * @create: 2023-06-05 22:09
 **/
public class DrawProcessResult extends Result {

    private DrawAwardVO drawAwardVO;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardVO drawAwardVO) {
        super(code, info);
        this.drawAwardVO = drawAwardVO;
    }

    public DrawAwardVO getDrawAwardVO() {
        return drawAwardVO;
    }

    public void setDrawAwardVO(DrawAwardVO drawAwardVO) {
        this.drawAwardVO = drawAwardVO;
    }
}
