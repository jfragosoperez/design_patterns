package com.jfragoso.designpatterns.abstractfactory;

/**
 * Created by jonathanfragoso on 11/06/14.
 */
public class LamborghiniFactory implements CarsFactory {

    @Override
    public Car buildCar() {
        return new LamborghiniCar();
    }
}
