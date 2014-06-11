package com.jfragoso.designpatterns.abstractfactory;

/**
 * Created by jonathanfragoso on 11/06/14.
 */
public class FerrariFactory implements CarsFactory{

    @Override
    public Car buildCar() {
        return new FerrariCar();
    }
}
