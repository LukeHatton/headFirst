package com.example.headfirst.decorator.beverage;

/**
 * <p>project: headFirst
 * <p>ClassName: Beverage
 * <p>Description:抽象类：饮料
 * <p>Date: 11/12/2021 22:32
 *
 * @author : Zhao Li
 */
public abstract class Beverage {
    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
