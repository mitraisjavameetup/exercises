package com.mitrais.bootcamp.cdi.exercise6;

import com.mitrais.bootcamp.cdi.common.provider.TravelService;
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
    public void setup()
    {
        context = new AnnotationConfigApplicationContext(DIProviderConfiguration.class);
    }

    @Test
    public void testCounting()
    {
        TravelService paymentGatewayService = context.getBean(TravelService.class);
        assertThat(paymentGatewayService.travelByCar()).isEqualTo(5);

        assertThat(paymentGatewayService.travelByAirPlane()).isEqualTo(2);
    }
}
