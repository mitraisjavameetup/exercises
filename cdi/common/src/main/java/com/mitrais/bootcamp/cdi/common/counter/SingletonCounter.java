package com.mitrais.bootcamp.cdi.common.counter;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */
@Named
@Singleton
public class SingletonCounter implements SingletonCountable
{
    private int counter = 0;

    @Override
    public int count()
    {
        counter++;
        System.out.printf("Singleton Counter : %d\n", counter);
        return counter;
    }
}
