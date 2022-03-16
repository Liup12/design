package com.winchance.adapter.factory;

import com.winchance.adapter.core.TradeClientAdapter;
import com.winchance.adapter.enums.PlatformEnum;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author xuande (xuande@dajiaok.com)
 * @date 2022/3/16  12:13:10
 */
@Component
public class TradeClientAdapterFactory implements ApplicationContextAware {


    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public TradeClientAdapter getTradeClientAdapter(PlatformEnum platformEnum){
        return (TradeClientAdapter) applicationContext.getBean(platformEnum.name());
    }
}

