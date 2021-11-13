package com.example.headfirst.decorator.beverage;

/**
 * <p>project: headFirst
 * <p>ClassName: HouseBlend
 * <p>Description:
 * <p>Date: 11/12/2021 22:39
 *
 * @author : Zhao Li
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89D;
    }
}
