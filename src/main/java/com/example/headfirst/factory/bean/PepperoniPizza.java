package com.example.headfirst.factory.bean;

/**
 * <p>project: headFirst
 * <p>ClassName: PepperoniPizza
 * <p>Description:
 * <p>Date: 11/14/2021 15:52
 *
 * @author : Zhao Li
 */
public class PepperoniPizza extends Pizza{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("辣椒洋葱披萨");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("辣椒洋葱披萨");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("辣椒洋葱披萨");
    }

    @Override
    public void box() {
        super.box();
        System.out.println("辣椒洋葱披萨");
    }
}
