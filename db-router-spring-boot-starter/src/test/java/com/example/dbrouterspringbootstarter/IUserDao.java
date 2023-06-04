package com.example.dbrouterspringbootstarter;

import com.example.dbrouterspringbootstarter.annotation.DBRouter;

/**
 * @program: lluck-draw
 * @description:
 * @author: lyj
 * @create: 2023-06-04 14:57
 **/
public interface IUserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);

}
