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

    {
        name = "希腊披萨";
        dough = "默认面饼";
        sauce = "默认酱料";
    }

    @Override
    public void prepare() {
        super.prepare();
    }

    @Override
    public void bake() {
        super.bake();
    }

    @Override
    public void cut() {
        super.cut();
    }

    @Override
    public void box() {
        super.box();
    }
}
