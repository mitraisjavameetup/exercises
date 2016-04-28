package com.mitrais.bootcamp.cdi.common.purchase;

import javax.inject.Named;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Named
public class FreeTaxAdapter implements TaxAdapter
{
    @Override
    public double calculate(double price)
    {
        return price;
    }
}
