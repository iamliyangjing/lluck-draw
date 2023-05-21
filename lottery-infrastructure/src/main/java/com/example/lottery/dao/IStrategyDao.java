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

    Strategy queryStrategy(Long strategyId);

}
