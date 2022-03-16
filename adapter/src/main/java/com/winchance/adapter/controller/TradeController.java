package com.winchance.adapter.controller;

import com.winchance.adapter.core.TradeClientAdapter;
import com.winchance.adapter.enums.PlatformEnum;
import com.winchance.adapter.factory.TradeClientAdapterFactory;
import com.winchance.adapter.mq.KsTradeMsg;
import com.winchance.adapter.mq.XhsTradeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

/**
 * @author xuande (xuande@dajiaok.com)
 * @date 2022/3/16  11:14:13
 */
@RestController
@RequestMapping("/trade")
public class TradeController {


    @Autowired
    private TradeClientAdapterFactory adapterFactory;

    /**
     * 接收小红书订单事件
     */
    @PostMapping("/xhs.client")
    public void xhsTradeReceiver(@RequestBody XhsTradeMsg xhsTradeMsg){

        // 异步推送mq。。。。

        // 这里直接实现mq消费逻辑
        TradeClientAdapter tradeClientAdapter = adapterFactory.getTradeClientAdapter(PlatformEnum.XHS);

        tradeClientAdapter.findTradeDetail(xhsTradeMsg.getPackageId());


    }


    /**
     * 接收快手订单事件
     */
    @PostMapping("/ks.client")
    public void ksTradeReceiver(@RequestBody KsTradeMsg ksTradeMsg){

        // 异步推送mq。。。。

        // 这里直接实现mq消费逻辑
        TradeClientAdapter tradeClientAdapter = adapterFactory.getTradeClientAdapter(PlatformEnum.KS);

        tradeClientAdapter.findTradeDetail(ksTradeMsg.getItemId());


    }
}
