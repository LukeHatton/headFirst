package com.example.headfirst.factory.pizza;

import com.example.headfirst.factory.bean.ChessPizza;
import com.example.headfirst.factory.bean.GreekPizza;
import com.example.headfirst.factory.bean.NYStyleChessPizza;
import com.example.headfirst.factory.bean.PepperoniPizza;
import com.example.headfirst.factory.bean.Pizza;

/**
 * <p>project: headFirst
 * <p>ClassName: NYPizzaStore
 * <p>Description:纽约披萨店
 * <p>Date: 11/14/2021 16:33
 *
 * @author : Zhao Li
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYStyleChessPizza();
                break;
            default:
        }
        return pizza;
    }
}
