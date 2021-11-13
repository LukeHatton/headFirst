package com.example.headfirst.decorator.beverage;

/**
 * <p>project: headFirst
 * <p>ClassName: Espresso
 * <p>Description:
 * <p>Date: 11/12/2021 22:37
 *
 * @author : Zhao Li
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99D;
    }
}
