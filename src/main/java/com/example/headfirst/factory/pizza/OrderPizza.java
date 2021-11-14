package com.example.headfirst.factory.pizza;

import com.example.headfirst.factory.bean.Pizza;

/**
 * <p>project: headFirst
 * <p>ClassName: OrderPizza
 * <p>Description:演示类：披萨订单
 * <p>Date: 11/14/2021 15:37
 *
 * @author : Zhao Li
 * @version 0.2 使用简单工厂(其实只是抽取代码)
 */
public class OrderPizza {

    SimplePizzaFactory simplePizzaFactory;

    public OrderPizza(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
