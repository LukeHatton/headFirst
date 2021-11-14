package com.example.headfirst.factory.pizza;

import com.example.headfirst.factory.bean.ChessPizza;
import com.example.headfirst.factory.bean.GreekPizza;
import com.example.headfirst.factory.bean.PepperoniPizza;
import com.example.headfirst.factory.bean.Pizza;

/**
 * <p>project: headFirst
 * <p>ClassName: OrderPizza
 * <p>Description:演示类：披萨订单
 * <p>Date: 11/14/2021 15:37
 *
 * @author : Zhao Li
 * @version 0.1 简单实现，不适用任何模式
 */
public class OrderPizza {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChessPizza();
            case "greek":
                pizza = new GreekPizza();
            case "pepperoni":
                pizza = new PepperoniPizza();
            default:
        }
        assert pizza != null;
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
