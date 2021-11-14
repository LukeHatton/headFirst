package com.example.headfirst.factory.pizza;

import com.example.headfirst.factory.bean.ChessPizza;
import com.example.headfirst.factory.bean.GreekPizza;
import com.example.headfirst.factory.bean.PepperoniPizza;
import com.example.headfirst.factory.bean.Pizza;

/**
 * <p>project: headFirst
 * <p>ClassName: SimplePizzaFactory
 * <p>Description:简单披萨工厂,太简单了以至于很难被称作是一个模式
 * <p>Date: 11/14/2021 15:59
 *
 * @author : Zhao Li
 * @version 0.1 单例模式的简单工厂
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChessPizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
        }
        return pizza;
    }
}

enum SimplePizzaFactoryEnum {
    INSTANCE;

    private final SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

    public SimplePizzaFactory getInstance() {
        return pizzaFactory;
    }
}
