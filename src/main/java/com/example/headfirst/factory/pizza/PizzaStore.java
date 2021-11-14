package com.example.headfirst.factory.pizza;

import com.example.headfirst.factory.bean.Pizza;

/**
 * <p>project: headFirst
 * <p>ClassName: OrderPizza
 * <p>Description:演示类：披萨订单
 * <p>Date: 11/14/2021 15:37
 *
 * @author : Zhao Li
 * @version 0.3 使用工厂方法模式重写
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /* 由子类决定创建Pizza的过程 */
    abstract Pizza createPizza(String type);
}
