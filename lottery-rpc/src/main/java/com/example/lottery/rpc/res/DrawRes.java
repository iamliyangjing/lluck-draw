package com.example.lottery.rpc.res;

import com.example.lottery.rpc.dto.AwardDTO;
import com.example.lotterycommon.Result;

import java.io.Serializable;

/**
 * @program: lluck-draw
 * @description: 抽奖结果
 * @author: lyj
 * @create: 2023-06-07 00:16
 **/
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }

}
