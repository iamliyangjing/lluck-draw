package com.example.dbrouterspringbootstarter;

/**
 * @program: lluck-draw
 * @description: 数据源基础配置
 * @author: lyj
 * @create: 2023-06-04 14:44
 **/
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }

}

