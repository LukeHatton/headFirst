package com.example.headfirst.factory.ingredient.pizzafactory;

import com.example.headfirst.factory.ingredient.PizzaIngredientFactory;

/**
 * <p>project: headFirst
 * <p>ClassName: NYPizzaStore
 * <p>Description:
 * <p>Date: 11/14/2021 20:59
 *
 * @author : Zhao Li
 */
public class NYPizzaStore extends NewPizzaStore {
    @Override
    NewPizza createPizza(IngredientEnum item) {
        NewPizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        switch (item) {
            case CHEESE:
                pizza = new NewCheesePizza(factory);
                pizza.setName("纽约风格起司披萨");
                break;
            case VEGGIE:
                pizza = new NewVeggiePizza(factory);
                System.out.println("纽约风格素食披萨");
                break;
            case CLAM:
                pizza = new NewClamPizza(factory);
                System.out.println("纽约风格蛤蜊披萨");
                break;
            case PEPPERONI:
                pizza = new NewPepperoniPizza(factory);
                System.out.println("纽约风格意式腊肠披萨");
                break;
            default:
        }
        return pizza;
    }
}
