package com.mitrais.bootcamp.cdi.exercise4;

import com.mitrais.bootcamp.cdi.common.counter.Countable;
import com.mitrais.bootcamp.cdi.common.counter.SingletonCountable;
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
        context = new AnnotationConfigApplicationContext(DICounterConfiguration.class);
    }

    @Test
    public void testCounting()
    {
        Countable countable1 = context.getBean(Countable.class);
        assertThat(countable1.count()).isEqualTo(1);
        // new instance of Countable is given by DI
        Countable countable2 = context.getBean(Countable.class);
        assertThat(countable2.count()).isEqualTo(1);

        SingletonCountable singletonCountable1 = context.getBean(SingletonCountable.class);
        assertThat(singletonCountable1.count()).isEqualTo(1);
        // The same instance of SingletonCountable is given by DI
        SingletonCountable singletonCountable2 = context.getBean(SingletonCountable.class);
        assertThat(singletonCountable2.count()).isEqualTo(2);
    }
}
