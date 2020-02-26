package com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay;

import java.math.BigDecimal;

/**
 * @author kangfw5
 * @since 2020-02-26
 */
public class CrossborderWeChatPayment implements ICrossborderPay {
    @Override
    public void crossborderPay(BigDecimal money) {
        System.out.println("境外微信支付：" + money);
    }
}
