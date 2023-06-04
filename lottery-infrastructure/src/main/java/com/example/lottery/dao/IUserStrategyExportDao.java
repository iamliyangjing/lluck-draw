package com.example.lottery.dao;

import com.example.dbrouterspringbootstarter.annotation.DBRouter;
import com.example.dbrouterspringbootstarter.annotation.DBRouterStrategy;
import com.example.lottery.po.UserStrategyExport;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: lluck-draw
 * @description: 用户策略计算结果表DAO
 * @author: lyj
 * @create: 2023-06-04 22:28
 **/
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserStrategyExportDao {

    /**
     * 新增数据
     * @param userStrategyExport 用户策略
     */
    @DBRouter(key = "uId")
    void insert(UserStrategyExport userStrategyExport);

    /**
     * 查询数据
     * @param uId 用户ID
     * @return 用户策略
     */
    @DBRouter
    UserStrategyExport queryUserStrategyExportByUId(String uId);

}
