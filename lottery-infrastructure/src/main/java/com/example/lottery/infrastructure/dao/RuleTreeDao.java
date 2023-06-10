package com.example.lottery.infrastructure.dao;

import com.example.lottery.infrastructure.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: lluck-draw
 * @description: 规则树配置DAO
 * @author: lyj
 * @create: 2023-06-06 23:17
 **/
@Mapper
public interface RuleTreeDao {

    /**
     * 规则树查询
     * @param id ID
     * @return   规则树
     */
    RuleTree queryRuleTreeByTreeId(Long id);

    /**
     * 规则树简要信息查询
     * @param treeId 规则树ID
     * @return       规则树
     */
    RuleTree queryTreeSummaryInfo(Long treeId);

}

