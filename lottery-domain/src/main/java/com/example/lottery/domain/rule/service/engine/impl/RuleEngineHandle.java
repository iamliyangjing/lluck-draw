package com.example.lottery.domain.rule.service.engine.impl;

import com.example.lottery.domain.rule.model.aggregates.TreeRuleRich;
import com.example.lottery.domain.rule.model.req.DecisionMatterReq;
import com.example.lottery.domain.rule.model.res.EngineResult;
import com.example.lottery.domain.rule.model.vo.TreeNodeVO;
import com.example.lottery.domain.rule.repository.IRuleRepository;
import com.example.lottery.domain.rule.service.engine.EngineBase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: lluck-draw
 * @description: 规则引擎处理器
 * @author: lyj
 * @create: 2023-06-06 23:03
 **/
@Service("ruleEngineHandle")
public class RuleEngineHandle extends EngineBase {

    @Resource
    private IRuleRepository ruleRepository;

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        // 决策规则树
        TreeRuleRich treeRuleRich = ruleRepository.queryTreeRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null!");
        }

        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);

        // 决策结果
        return new EngineResult(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }

}
