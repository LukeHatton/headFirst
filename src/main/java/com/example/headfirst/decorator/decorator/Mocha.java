package com.example.headfirst.decorator.decorator;

import com.example.headfirst.decorator.beverage.Beverage;

/**
 * <p>project: headFirst
 * <p>ClassName: Mocha
 * <p>Description:
 * <p>Date: 11/12/2021 22:43
 *
 * @author : Zhao Li
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2D;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }
}
