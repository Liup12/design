package com.winchance.adapter.mq;

import lombok.Data;

import java.util.Date;

/**
 * @author xuande (xuande@dajiaok.com)
 * @date 2022/3/16  10:16:07
 */
@Data
public class KsTradeMsg {

    /**
     * 订单Id
     */
    private String itemId;

    /**
     * 买家昵称
     */
    private String sellerId;

    /**
     * 支付时间
     */
    private Date   createTime;

}
