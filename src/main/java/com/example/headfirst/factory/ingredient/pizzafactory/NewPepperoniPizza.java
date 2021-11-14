package com.example.headfirst.factory.ingredient.pizzafactory;

import com.example.headfirst.factory.ingredient.PizzaIngredientFactory;

/**
 * <p>project: headFirst
 * <p>ClassName: NewPepperoniPizza
 * <p>Description:
 * <p>Date: 11/14/2021 21:09
 *
 * @author : Zhao Li
 */
public class NewPepperoniPizza extends NewPizza {
    PizzaIngredientFactory factory;

    public NewPepperoniPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("准备: " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        pepperoni = factory.createPepperoni();
    }
}
