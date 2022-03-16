package com.winchance.adapter.service;

import com.alibaba.fastjson.JSON;
import com.winchance.adapter.mq.XhsTradeMsg;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 * 小红书订单查询接口
 * @author xuande (xuande@dajiaok.com)
 * @date 2022/3/16  10:24:20
 */
@Component
public class XhsTradeClient {


    /**
     * 小红书订单查询接口
     */
    public void findXhsTradeDetail(String packageId){
        XhsTradeMsg xhsTradeMsg = new XhsTradeMsg();
        xhsTradeMsg.setPackageId(packageId);
        xhsTradeMsg.setUpdateTime(new Date());
        xhsTradeMsg.setPackageStatus("WAIT_SELLER_SEND_GOODS");
        System.out.println("查询出小红书订单：" + JSON.toJSONString(xhsTradeMsg));
    }
}
