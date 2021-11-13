package com.example.headfirst.decorator.beverage;

/**
 * <p>project: headFirst
 * <p>ClassName: Decat
 * <p>Description:
 * <p>Date: 11/12/2021 22:41
 *
 * @author : Zhao Li
 */
public class Decat extends Beverage {

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.49D;
    }
}
