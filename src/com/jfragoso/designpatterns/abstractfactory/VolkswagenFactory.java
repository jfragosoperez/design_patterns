package com.jfragoso.designpatterns.abstractfactory;

/**
 * Created by jonathanfragoso on 11/06/14.
 */
public class VolkswagenFactory implements CarsFactory {

    @Override
    public Car buildCar() {
        return new VolkswagenCar();
    }

    @Override
    public Engine buildEngine() {
        return new VolkswagenEngine();
    }
}
