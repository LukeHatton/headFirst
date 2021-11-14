package com.example.headfirst.factory.ingredient.pizzafactory;

import com.example.headfirst.factory.ingredient.PizzaIngredientFactory;

/**
 * <p>project: headFirst
 * <p>ClassName: NewVeggiePizza
 * <p>Description:
 * <p>Date: 11/14/2021 21:06
 *
 * @author : Zhao Li
 */
public class NewVeggiePizza extends NewPizza{
    PizzaIngredientFactory factory;

    public NewVeggiePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("准备: " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        veggies = factory.createVeggies();
    }
}
