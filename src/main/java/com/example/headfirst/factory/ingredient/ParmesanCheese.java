package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: ParmesanCheese
 * <p>Description:
 * <p>Date: 11/14/2021 20:40
 *
 * @author : Zhao Li
 */
public class ParmesanCheese extends Cheese {
    @Override
    public String getName() {
        return "Parmesan" + super.getName();
    }
}
