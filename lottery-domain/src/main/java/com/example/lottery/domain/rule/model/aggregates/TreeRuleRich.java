package com.example.lottery.domain.rule.model.aggregates;

import com.example.lottery.domain.rule.model.vo.TreeNodeVO;
import com.example.lottery.domain.rule.model.vo.TreeRootVO;

import java.util.Map;

/**
 * @program: lluck-draw
 * @description: 规则树聚合
 * @author: lyj
 * @create: 2023-06-06 00:12
 **/
public class TreeRuleRich {

    /** 树根信息 */
    private TreeRootVO treeRoot;
    /** 树节点ID -> 子节点 */
    private Map<Long, TreeNodeVO> treeNodeMap;

    public TreeRootVO getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRootVO treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNodeVO> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNodeVO> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
