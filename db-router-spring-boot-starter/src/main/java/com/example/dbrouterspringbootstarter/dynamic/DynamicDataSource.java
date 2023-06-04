package com.example.dbrouterspringbootstarter.dynamic;

import com.example.dbrouterspringbootstarter.DBContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-06-04 14:48
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }

}

