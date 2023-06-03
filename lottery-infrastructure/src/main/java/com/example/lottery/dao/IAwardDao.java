package com.example.lottery.dao;

import com.example.lottery.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 10:39
 **/
@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

    /**
     * 插入奖品配置
     *
     * @param list 奖品配置
     */
    void insertList(List<Award> list);
}
