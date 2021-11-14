package com.example.headfirst.factory.pizza;

import com.example.headfirst.factory.bean.ChicagoChessPizza;
import com.example.headfirst.factory.bean.Pizza;

/**
 * <p>project: headFirst
 * <p>ClassName: ChicagoPizzaStore
 * <p>Description:芝加哥披萨店
 * <p>Date: 11/14/2021 16:33
 *
 * @author : Zhao Li
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoChessPizza();
                break;
            default:
        }
        return pizza;
    }
}
