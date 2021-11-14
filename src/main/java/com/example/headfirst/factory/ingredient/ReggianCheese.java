package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: ReggianCheese
 * <p>Description:原料:Reggian起司
 * <p>Date: 11/14/2021 20:26
 *
 * @author : Zhao Li
 */
public class ReggianCheese extends Cheese {
    @Override
    public String getName() {
        return "Reggian" + super.getName();
    }
}
