package com.mitrais.bootcamp.cdi.exercise1;

import com.mitrais.bootcamp.cdi.common.payment.PaymentGateway;
import com.mitrais.bootcamp.cdi.common.payment.PayPalGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Configuration
@ComponentScan("com.mitrais.bootcamp.cdi.common.payment")
public class DIPaymentConfiguration
{
    @Bean
    public PaymentGateway paymentGateway(){
        return new PayPalGateway();
    }
}
