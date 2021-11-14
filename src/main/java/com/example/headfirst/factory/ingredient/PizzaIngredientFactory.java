package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: PizzaIngredientFactory
 * <p>Description:披萨原料工厂类
 * <p>Date: 11/14/2021 20:09
 *
 * @author : Zhao Li
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
