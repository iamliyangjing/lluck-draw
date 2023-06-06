package com.example.lottery.domain.rule.service.engine;

import com.example.lottery.domain.rule.model.req.DecisionMatterReq;
import com.example.lottery.domain.rule.model.res.EngineResult;

/**
 * @program: lluck-draw
 * @description: 规则过滤器引擎
 * @author: lyj
 * @create: 2023-06-06 00:14
 **/
public interface EngineFilter {

    /**
     * 规则过滤器接口
     *
     * @param matter      规则决策物料
     * @return            规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);

}
