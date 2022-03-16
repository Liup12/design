package com.winchance.adapter.mq;

import lombok.Data;

import java.util.Date;

/**
 * @author xuande (xuande@dajiaok.com)
 * @date 2022/3/16  10:15:58
 */
@Data
public class XhsTradeMsg {

    /**
     * 订单Id
     */
    private String packageId;

    /**
     * 订单状态
     */
    private String packageStatus;

    /**
     * 更新时间
     */
    private Date updateTime;

}
