package com.example.lottery.domain.rule.service.engine;

import com.example.lottery.domain.rule.service.logic.LogicFilter;
import com.example.lottery.domain.rule.service.logic.impl.UserAgeFilter;
import com.example.lottery.domain.rule.service.logic.impl.UserGenderFilter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-06-06 00:15
 **/
public class EngineConfig {

    protected static Map<String, LogicFilter> logicFilterMap = new ConcurrentHashMap<>();

    @Resource
    private UserAgeFilter userAgeFilter;
    @Resource
    private UserGenderFilter userGenderFilter;

    @PostConstruct
    public void init() {
        logicFilterMap.put("userAge", userAgeFilter);
        logicFilterMap.put("userGender", userGenderFilter);
    }
}
