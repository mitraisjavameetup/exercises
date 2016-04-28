package com.mitrais.bootcamp.cdi.common.purchase;

import javax.inject.Named;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
public class VatTaxAdapter implements TaxAdapter
{
    private final double rate;

    public VatTaxAdapter(double rate)
    {
        this.rate = rate;
    }

    @Override
    public double calculate(double price)
    {
        return price + (price * rate);
    }
}
