package com.example.lottery.domain.activity.service.partake;

import com.example.lottery.domain.activity.model.req.PartakeReq;
import com.example.lottery.domain.activity.model.res.PartakeResult;
import com.example.lottery.domain.activity.model.vo.DrawOrderVO;
import com.example.lottery.domain.activity.model.vo.InvoiceVO;
import com.example.lotterycommon.Result;

import java.util.List;

/**
 * @program: lluck-draw
 * @description: 抽奖接口参与活动
 * @author: lyj
 * @create: 2023-06-04 00:44
 **/
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);
    /**
     * 保存奖品单
     * @param drawOrder 奖品单
     * @return          保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);

    /**
     * 更新发货单MQ状态
     *  @param uId      用户ID
     * @param orderId   订单ID
     * @param mqState   MQ 发送状态
     */
    void updateInvoiceMqState(String uId, Long orderId, Integer mqState);
    /**
     * 扫描发货单 MQ 状态，把未发送 MQ 的单子扫描出来，做补偿
     *
     * @param dbCount 指定分库
     * @param tbCount 指定分表
     * @return 发货单
     */
    List<InvoiceVO> scanInvoiceMqState(int dbCount, int tbCount);

}
