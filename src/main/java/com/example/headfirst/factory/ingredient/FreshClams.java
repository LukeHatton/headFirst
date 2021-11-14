package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: FreshClams
 * <p>Description:原料:新鲜蛤蜊
 * <p>Date: 11/14/2021 20:29
 *
 * @author : Zhao Li
 */
public class FreshClams extends Clams {
    @Override
    public String getName() {
        return "新鲜" + super.getName();
    }
}
