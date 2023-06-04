package com.example.lottery.dao;

import com.example.dbrouterspringbootstarter.annotation.DBRouter;
import com.example.lottery.po.UserTakeActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-06-04 15:10
 **/
@Mapper
public interface IUserTakeActivityDao {

    /**
     * 插入用户领取活动信息
     *
     * @param userTakeActivity 入参
     */
    @DBRouter(key = "uId")
    void insert(UserTakeActivity userTakeActivity);

}
