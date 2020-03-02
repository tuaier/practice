package com.tuaier.gupao.pattern.factory.abstractFactoryTask.factory;

import com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay.*;

/**
 * @author kangfw5
 * @since 2020-02-26
 */
public class WeChatPaymentFactory extends AbstractPaymentFactory {

    @Override
    public IDomesticPay createDomesticPay() {
        super.payPrepare();
        return new DomesticWeChatPayment();
    }

    @Override
    public ICrossborderPay createCrossborderPay() {
        return new CrossborderWeChatPayment();
    }
}
