package com.mitrais.bootcamp.cdi.common.counter;

import javax.inject.Named;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */
@Named
public class Counter implements Countable
{
    private int counter = 0;
    @Override
    public int count()
    {
        counter++;
        System.out.printf("Counter : %d\n", counter);
        return counter;
    }
}
