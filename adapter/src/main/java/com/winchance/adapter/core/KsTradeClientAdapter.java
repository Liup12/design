package com.winchance.adapter.core;


import com.winchance.adapter.service.KsTradeClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author xuande (xuande@dajiaok.com)
 * @date 2022/3/16  10:36:01
 */
@Component(value = "KS")
public class KsTradeClientAdapter implements TradeClientAdapter {

    @Resource
    private KsTradeClient ksTradeClient;

    @Override
    public void findTradeDetail(String tid) {
        ksTradeClient.findKsTradeDetail(tid);
    }
}
