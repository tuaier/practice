package com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay;

import java.math.BigDecimal;

/**
 * @author kangfw5
 * @since 2020-02-26
 */
public class DomesticWeChatPayment implements IDomesticPay {
    @Override
    public void domesticPay(BigDecimal money) {
        System.out.println("境内微信支付" + money);
    }
}
