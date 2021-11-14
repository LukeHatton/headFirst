package com.example.headfirst.factory.bean;

/**
 * <p>project: headFirst
 * <p>ClassName: GreekPizza
 * <p>Description:
 * <p>Date: 11/14/2021 15:51
 *
 * @author : Zhao Li
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("希腊披萨");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("希腊披萨");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("希腊披萨");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("希腊披萨");
    }
}
