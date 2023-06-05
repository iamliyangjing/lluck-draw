package com.example.lottery.application.process;

import com.example.lottery.application.process.req.DrawProcessReq;
import com.example.lottery.application.process.res.DrawProcessResult;

/**
 * @program: lluck-draw
 * @description: 活动抽奖流程编排接口
 * @author: lyj
 * @create: 2023-06-05 22:09
 **/
public interface IActivityProcess {
    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);

}
