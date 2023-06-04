package com.example.lottery.domain.support.ids.policy;

import com.example.lottery.domain.support.ids.IIdGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-06-04 11:03
 **/
@Component
public class RandomNumeric implements IIdGenerator {

    @Override
    public long nextId() {
        return Long.parseLong(RandomStringUtils.randomNumeric(11));
    }

}
