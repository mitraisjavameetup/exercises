package com.mitrais.bootcamp.cdi.common.payment;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */

public class BitCoinGateway implements PaymentGateway
{
    @Override
    public int pay()
    {
        System.out.printf("Paid using BITCOIN\n");
        return 1;
    }
}
