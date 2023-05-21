package com.example.lottery.dao;

import com.example.lottery.po.Award;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-21 10:39
 **/
@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

}
