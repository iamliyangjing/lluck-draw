package com.example.lottery.rpc;

import com.example.lottery.rpc.req.ActivityReq;
import com.example.lottery.rpc.res.ActivityRes;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 01:05
 **/
public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
