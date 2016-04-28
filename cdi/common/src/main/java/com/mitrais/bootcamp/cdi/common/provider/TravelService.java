package com.mitrais.bootcamp.cdi.common.provider;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */
@Named
public class TravelService
{
    @Inject
    private Provider<Car> carProvider;

    @Inject
    private Provider<AirPlane> airPlaneProvider;

    public int travelByCar()
    {
        Travel travel = carProvider.get();
        return travel.travel();
    }
    public int travelByAirPlane()
    {
        Travel travel = airPlaneProvider.get();
        return travel.travel();
    }
}
