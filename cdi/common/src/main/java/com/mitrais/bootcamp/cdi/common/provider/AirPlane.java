package com.mitrais.bootcamp.cdi.common.provider;

import javax.inject.Named;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */

@Named
public class AirPlane implements Travel
{
    private static final int TIME = 2;

    @Override
    public int travel()
    {
        System.out.printf("Traveling using AirPlane in %d hours\n", TIME);
        return TIME;
    }
}
