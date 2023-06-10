package com.example.lottery.infrastructure.dao;

import com.example.dbrouterspringbootstarter.annotation.DBRouter;
import com.example.dbrouterspringbootstarter.annotation.DBRouterStrategy;
import com.example.lottery.infrastructure.po.UserStrategyExport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
    @DBRouter(key = "uId")
    UserStrategyExport queryUserStrategyExportByUId(String uId);
    /**
     * 更新发奖状态
     * @param userStrategyExport 发奖信息
     */
    @DBRouter(key = "uId")
    void updateUserAwardState(UserStrategyExport userStrategyExport);

    /**
     * 更新发送MQ状态
     * @param userStrategyExport 发送消息
     */
    @DBRouter(key = "uId")
    void updateInvoiceMqState(UserStrategyExport userStrategyExport);


    /**
     * 扫描发货单 MQ 状态，把未发送 MQ 的单子扫描出来，做补偿
     *
     * @return 发货单
     */
    List<UserStrategyExport> scanInvoiceMqState();

}
