package com.winchance.adapter.core;


import com.winchance.adapter.service.XhsTradeClient;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * @author xuande (xuande@dajiaok.com)
 * @date 2022/3/16  10:35:40
 */
@Component("XHS")
public class XhsTradeClientAdapter implements TradeClientAdapter{

    @Resource
    private XhsTradeClient xhsTradeClient;

    @Override
    public void findTradeDetail(String tid) {
        xhsTradeClient.findXhsTradeDetail(tid);
    }


}
