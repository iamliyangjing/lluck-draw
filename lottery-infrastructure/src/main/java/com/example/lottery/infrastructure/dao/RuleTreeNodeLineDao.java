package com.example.lottery.infrastructure.dao;

import com.example.lottery.infrastructure.po.RuleTreeNodeLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: lluck-draw
 * @description: 规则树节点连线DAO
 * @author: lyj
 * @create: 2023-06-06 23:17
 **/
@Mapper
public interface RuleTreeNodeLineDao {

    /**
     * 查询规则树节点连线集合
     * @param req   入参
     * @return      规则树节点连线集合
     */
    List<RuleTreeNodeLine> queryRuleTreeNodeLineList(RuleTreeNodeLine req);

    /**
     * 查询规则树连线数量
     *
     * @param treeId    规则树ID
     * @return          规则树连线数量
     */
    int queryTreeNodeLineCount(Long treeId);

}

