package com.example.dbrouterspringbootstarter.annotation;

import java.lang.annotation.*;

/**
 * @program: lluck-draw
 * @description: 路由策略、分表标记
 * @author: lyj
 * @create: 2023-06-04 14:42
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {

    boolean splitTable() default false;

}