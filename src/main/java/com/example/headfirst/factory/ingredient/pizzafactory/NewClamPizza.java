package com.example.headfirst.factory.ingredient.pizzafactory;

import com.example.headfirst.factory.ingredient.PizzaIngredientFactory;

/**
 * <p>project: headFirst
 * <p>ClassName: NewClamPizza
 * <p>Description:
 * <p>Date: 11/14/2021 20:51
 *
 * @author : Zhao Li
 */
public class NewClamPizza extends NewPizza {
    PizzaIngredientFactory factory;

    public NewClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("准备: " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clams = factory.createClams();
    }
}
