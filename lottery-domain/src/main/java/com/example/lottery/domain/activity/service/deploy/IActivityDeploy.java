package com.example.lottery.domain.activity.service.deploy;

import com.example.lottery.domain.activity.model.req.ActivityConfigReq;

/**
 * @program: lluck-draw
 * @description: 部署活动配置接口
 * @author: lyj
 * @create: 2023-06-04 00:38
 **/
public interface IActivityDeploy {

    /**
     * 创建活动信息
     *
     * @param req 活动配置信息
     */
    void createActivity(ActivityConfigReq req);

    /**
     * 修改活动信息
     *
     * @param req 活动配置信息
     */
    void updateActivity(ActivityConfigReq req);

}
