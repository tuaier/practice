package com.tuaier.gupao.pattern.factory.abstractFactoryTask.factory;

import com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay.ICrossborderPay;
import com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay.IDomesticPay;

/**
 * @author kangfw5
 * @since 2020-02-26
 */
public abstract class AbstractPaymentFactory {
    public void payPrepare(){
        //common operation
    }

    public abstract IDomesticPay createDomesticPay();

    public abstract ICrossborderPay createCrossborderPay();
}
