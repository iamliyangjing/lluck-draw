package com.example.lottery.infrastructure.dao;

import com.example.dbrouterspringbootstarter.annotation.DBRouter;
import com.example.lottery.infrastructure.po.UserTakeActivityCount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: lluck-draw
 * @description: 用户活动参与次数表Dao
 * @author: lyj
 * @create: 2023-06-04 22:43
 **/
@Mapper
public interface IUserTakeActivityCountDao {

    /**
     * 查询用户领取次数信息
     * @param userTakeActivityCountReq 请求入参【活动号、用户ID】
     * @return 领取结果
     */
    @DBRouter(key = "uId")
    UserTakeActivityCount queryUserTakeActivityCount(UserTakeActivityCount userTakeActivityCountReq);

    /**
     * 插入领取次数信息
     * @param userTakeActivityCount 请求入参
     */
//    @DBRouter
    void insert(UserTakeActivityCount userTakeActivityCount);

    /**
     * 更新领取次数信息
     * @param userTakeActivityCount 请求入参
     * @return 更新数量
     */
//    @DBRouter
    int updateLeftCount(UserTakeActivityCount userTakeActivityCount);

}
