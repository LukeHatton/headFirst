package com.example.headfirst.decorator.decorator;

import com.example.headfirst.decorator.beverage.Beverage;

/**
 * <p>project: headFirst
 * <p>ClassName: Whip
 * <p>Description:
 * <p>Date: 11/12/2021 22:46
 *
 * @author : Zhao Li
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3D;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }
}
