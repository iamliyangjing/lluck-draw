package com.example.lottery.domain.rule.service.logic.impl;

import com.example.lottery.domain.rule.model.req.DecisionMatterReq;
import com.example.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @program: lluck-draw
 * @description: 性别规则
 * @author: lyj
 * @create: 2023-06-06 00:19
 **/
@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }

}
