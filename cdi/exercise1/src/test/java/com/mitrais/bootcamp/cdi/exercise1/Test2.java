package com.mitrais.bootcamp.cdi.exercise1;

import com.mitrais.bootcamp.cdi.common.payment.PaymentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
public class Test2
{
    private ApplicationContext context;

    @Before
    public void setup(){
        context = new AnnotationConfigApplicationContext(DIPaymentConfiguration.class);
    }

    @Test
    public void testPayment(){
        PaymentService service = context.getBean(PaymentService.class);
        assertThat(service.completePayment()).isEqualTo(3);
    }
}
