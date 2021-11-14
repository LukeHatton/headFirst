package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: SlicedPepperoni
 * <p>Description:原料:意式腊肠切片
 * <p>Date: 11/14/2021 20:29
 *
 * @author : Zhao Li
 */
public class SlicedPepperoni extends Pepperoni{
    @Override
    public String getName() {
        return "切片" + super.getName();
    }
}
