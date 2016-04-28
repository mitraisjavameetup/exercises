package com.mitrais.bootcamp.cdi.common.web;

import com.mitrais.bootcamp.cdi.common.web.annotations.WebRequestScope;

import javax.inject.Named;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */
@Named("request")
@WebRequestScope
public class RequestCounter implements Countable
{
    private int counter = 0;

    @Override
    public int count()
    {
        counter++;
        System.out.printf("Request Counter : %d\n", counter);
        return counter;
    }
}
