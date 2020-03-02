package com.tuaier.gupao.pattern.factory.abstractFactoryTask.factory;

import com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay.CrossborderAliPayPayment;
import com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay.DomesticAliPayPayment;
import com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay.ICrossborderPay;
import com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay.IDomesticPay;

/**
 * @author kangfw5
 * @since 2020-02-26
 */
public class AliPayPaymentFactory extends AbstractPaymentFactory {

    @Override
    public IDomesticPay createDomesticPay() {
        super.payPrepare();
        return new DomesticAliPayPayment();
    }

    @Override
    public ICrossborderPay createCrossborderPay() {
        super.payPrepare();
        return new CrossborderAliPayPayment();
    }
}
