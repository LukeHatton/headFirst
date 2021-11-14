package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: ThinCrustDough
 * <p>Description:原料:薄脆面团
 * <p>Date: 11/14/2021 20:25
 *
 * @author : Zhao Li
 */
public class ThinCrustDough extends Dough {
    @Override
    public String getName() {
        return "薄脆" + super.getName();
    }
}
