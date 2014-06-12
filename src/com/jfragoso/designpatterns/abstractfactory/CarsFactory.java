package com.jfragoso.designpatterns.abstractfactory;


/**
 * Created by jonathanfragoso on 11/06/14.
 */
public interface CarsFactory {
    public Car buildCar();

    //some brands build engines for other
    public Engine buildEngine();
}
