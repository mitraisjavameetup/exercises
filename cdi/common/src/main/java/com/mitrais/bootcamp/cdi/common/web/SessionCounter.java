package com.mitrais.bootcamp.cdi.common.web;

import com.mitrais.bootcamp.cdi.common.web.annotations.WebSessionScope;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */
@Named("session")
@WebSessionScope
public class SessionCounter implements Countable
{
    private int counter = 0;

    @Override
    public int count()
    {
        counter++;
        System.out.printf("Session Counter : %d\n", counter);
        return counter;
    }
}
