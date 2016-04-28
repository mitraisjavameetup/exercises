package com.mitrais.bootcamp.cdi.common.payment;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Named
public class GenericPaymentService implements PaymentService
{
    private PaymentGateway gateway;

    @Inject
    public GenericPaymentService(PaymentGateway gateway)
    {
        this.gateway = gateway;
    }

    @Override
    public int completePayment()
    {
        System.out.printf("Finished checkout\n");
        return gateway.pay() + 1;
    }
}
