package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: TomatoSauce
 * <p>Description:原料:番茄酱
 * <p>Date: 11/14/2021 20:38
 *
 * @author : Zhao Li
 */
public class TomatoSauce extends Sauce {
    @Override
    public String getName() {
        return "番茄" + super.getName();
    }
}
