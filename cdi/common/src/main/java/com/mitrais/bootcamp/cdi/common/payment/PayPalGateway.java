package com.mitrais.bootcamp.cdi.common.payment;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */

public class PayPalGateway implements PaymentGateway
{

    @Override
    public int pay()
    {
        System.out.println("Paid using PAYPAL");
        return 2;
    }
}
