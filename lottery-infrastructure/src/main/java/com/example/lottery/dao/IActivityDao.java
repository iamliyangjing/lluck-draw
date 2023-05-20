package com.example.lottery.dao;

import com.example.lottery.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-05-19 23:02
 **/
@Mapper
public interface IActivityDao {

    void insert(Activity req);

    Activity queryActivityById(Long activityId);
}
