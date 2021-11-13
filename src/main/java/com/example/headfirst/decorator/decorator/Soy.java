package com.example.headfirst.decorator.decorator;

import com.example.headfirst.decorator.beverage.Beverage;

/**
 * <p>project: headFirst
 * <p>ClassName: Soy
 * <p>Description:
 * <p>Date: 11/12/2021 22:45
 *
 * @author : Zhao Li
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.4D;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Soy";
    }
}
