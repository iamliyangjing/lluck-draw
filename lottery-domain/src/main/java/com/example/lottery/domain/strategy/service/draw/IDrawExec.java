package com.example.lottery.domain.strategy.service.draw;

import com.example.lottery.domain.strategy.domain.req.DrawReq;
import com.example.lottery.domain.strategy.domain.res.DrawResult;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 12:15
 **/
public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);

}
