package com.example.dbrouterspringbootstarter.annotation;

import java.lang.annotation.*;

/**
 * @program: lluck-draw
 * @description: 路由注解
 * @author: lyj
 * @create: 2023-06-04 14:41
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {

    /** 分库分表字段 */
    String key() default "";

}