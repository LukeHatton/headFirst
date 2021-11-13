package com.example.headfirst.decorator.decorator;

import com.example.headfirst.decorator.beverage.Beverage;

/**
 * <p>project: headFirst
 * <p>ClassName: Condiment
 * <p>Description:抽象类：调料
 * <p>Date: 11/12/2021 22:34
 *
 * @author : Zhao Li
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
