package com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay;

import java.math.BigDecimal;

/**
 * @author kangfw5
 * @since 2020-02-26
 */
public class DomesticAliPayPayment implements IDomesticPay {
    @Override
    public void domesticPay(BigDecimal money) {
        System.out.println("境内支付宝支付：" + money);
    }
}
