package com.mitrais.bootcamp.cdi.exercise2;

import com.mitrais.bootcamp.cdi.common.purchase.TaxAdapter;
import com.mitrais.bootcamp.cdi.common.purchase.VatTaxAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Configuration
@ComponentScan("com.mitrais.bootcamp.cdi.common.purchase")
public class DIPurchaseConfiguration
{
    @Bean
    public TaxAdapter vatTaxAdapter(){
        return new VatTaxAdapter(0.1);
    }
}
