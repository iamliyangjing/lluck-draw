package com.example.lottery.dao;

import com.example.lottery.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 10:39
 **/
@Mapper
public interface IStrategyDao {
    /**
     * 查询策略配置
     *
     * @param strategyId 策略ID
     * @return           策略配置信息
     */
    Strategy queryStrategy(Long strategyId);
    /**
     * 插入策略配置
     *
     * @param req 策略配置
     */
    void insert(Strategy req);
}
