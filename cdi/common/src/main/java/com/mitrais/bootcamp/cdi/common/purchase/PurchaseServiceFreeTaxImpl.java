package com.mitrais.bootcamp.cdi.common.purchase;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Named
public class PurchaseServiceFreeTaxImpl
{
    @Inject
    @Named("freeTaxAdapter")
    private TaxAdapter adapter;

    public double purchase(double price)
    {
        double result = adapter.calculate(price);
        System.out.printf("Do purchase with Free Tax : %.1f\n", result);
        return result;
    }
}
