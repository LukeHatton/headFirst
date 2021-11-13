package com.example.headfirst.decorator.beverage;

/**
 * <p>project: headFirst
 * <p>ClassName: DarkRoast
 * <p>Description:
 * <p>Date: 11/12/2021 22:40
 *
 * @author : Zhao Li
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "dark roast coffee";
    }

    @Override
    public double cost() {
        return 1.19D;
    }
}
