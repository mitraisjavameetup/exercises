package com.mitrais.bootcamp.cdi.exercise2;

import com.mitrais.bootcamp.cdi.common.purchase.PurchaseServiceFreeTaxImpl;
import com.mitrais.bootcamp.cdi.common.purchase.PurchaseServiceVatTaxImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
public class Test1
{
    private ApplicationContext context;

    @Before
    public void setup(){
        context = new AnnotationConfigApplicationContext(DIPurchaseConfiguration.class);
    }
    @Test
    public void testPurchase(){
        PurchaseServiceFreeTaxImpl freeTax = context.getBean(PurchaseServiceFreeTaxImpl.class);
        assertThat(freeTax.purchase(100)).isEqualTo(100);

        PurchaseServiceVatTaxImpl vatTax = context.getBean(PurchaseServiceVatTaxImpl.class);
        assertThat(vatTax.purchase(100)).isEqualTo(110);
    }
}
