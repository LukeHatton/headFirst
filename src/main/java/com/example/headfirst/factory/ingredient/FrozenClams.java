package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: FrozenClams
 * <p>Description:原料:冷冻蛤蜊
 * <p>Date: 11/14/2021 20:30
 *
 * @author : Zhao Li
 */
public class FrozenClams extends Clams {
    @Override
    public String getName() {
        return "冷冻" + super.getName();
    }
}
