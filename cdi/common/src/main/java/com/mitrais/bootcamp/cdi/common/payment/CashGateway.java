package com.mitrais.bootcamp.cdi.common.payment;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */

public class CashGateway implements PaymentGateway
{

    @Override
    public int pay()
    {
        System.out.printf("Paid using CASH\n");
        return 0;
    }
}
