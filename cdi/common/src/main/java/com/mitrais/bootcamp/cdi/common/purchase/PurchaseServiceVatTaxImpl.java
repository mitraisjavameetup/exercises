package com.mitrais.bootcamp.cdi.common.purchase;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Named
public class PurchaseServiceVatTaxImpl
{
    private TaxAdapter adapter;

    public double purchase(int price)
    {
        double result = adapter.calculate(price);
        System.out.printf("Do purchase with VAT : %.1f\n", result);
        return result;
    }

    public TaxAdapter getAdapter()
    {
        return adapter;
    }

    @Inject
    @Named("vatTaxAdapter")
    public void setAdapter(TaxAdapter adapter)
    {
        this.adapter = adapter;
    }
}
