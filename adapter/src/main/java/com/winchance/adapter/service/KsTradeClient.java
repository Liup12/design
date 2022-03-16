package com.winchance.adapter.service;

import com.alibaba.fastjson.JSON;
import com.winchance.adapter.mq.KsTradeMsg;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 * 快手订单查询接口
 * @author xuande (xuande@dajiaok.com)
 * @date 2022/3/16  10:24:20
 */
@Component
public class KsTradeClient {

    /**
     * 快手订单查询接口
     */
    public void findKsTradeDetail(String tid){
        KsTradeMsg ksTradeMsg = new KsTradeMsg();
        ksTradeMsg.setItemId(tid);
        ksTradeMsg.setCreateTime(new Date());
        ksTradeMsg.setSellerId("123123");
        System.out.println("查询出快手订单：" + JSON.toJSONString(ksTradeMsg));
    }
}
