package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: ThickDough
 * <p>Description:
 * <p>Date: 11/14/2021 20:43
 *
 * @author : Zhao Li
 */
public class ThickDough extends Dough {
    @Override
    public String getName() {
        return "厚" + super.getName();
    }
}
