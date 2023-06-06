package com.example.lottery.domain.rule.repository;

import com.example.lottery.domain.rule.model.aggregates.TreeRuleRich;

/**
 * @program: lluck-draw
 * @description: 规则信息仓储服务接口
 * @author: lyj
 * @create: 2023-06-06 00:13
 **/
public interface IRuleRepository {

    /**
     * 查询规则决策树配置
     *
     * @param treeId    决策树ID
     * @return          决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);

}
