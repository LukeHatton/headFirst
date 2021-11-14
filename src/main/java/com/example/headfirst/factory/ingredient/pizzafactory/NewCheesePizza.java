package com.example.headfirst.factory.ingredient.pizzafactory;

import com.example.headfirst.factory.ingredient.PizzaIngredientFactory;

/**
 * <p>project: headFirst
 * <p>ClassName: NewCheesePizza
 * <p>Description:
 * <p>Date: 11/14/2021 20:50
 *
 * @author : Zhao Li
 */
public class NewCheesePizza extends NewPizza {
    PizzaIngredientFactory factory;

    public NewCheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("准备: " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}
