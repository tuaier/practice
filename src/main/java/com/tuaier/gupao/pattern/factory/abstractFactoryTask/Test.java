package com.tuaier.gupao.pattern.factory.abstractFactoryTask;

import com.tuaier.gupao.pattern.factory.abstractFactoryTask.factory.AbstractPaymentFactory;
import com.tuaier.gupao.pattern.factory.abstractFactoryTask.factory.AliPayPaymentFactory;
import com.tuaier.gupao.pattern.factory.abstractFactoryTask.pay.IDomesticPay;

import java.math.BigDecimal;

/**
 * @author kangfw5
 * @since 2020-02-26
 */
public class Test {
    public static void main(String[] args) {
        AliPayPaymentFactory factory = new AliPayPaymentFactory();
        IDomesticPay domesticPay = factory.createDomesticPay();
        domesticPay.domesticPay(new BigDecimal(100));
    }
}
