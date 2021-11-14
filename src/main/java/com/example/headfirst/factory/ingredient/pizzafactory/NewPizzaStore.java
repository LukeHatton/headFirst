package com.example.headfirst.factory.ingredient.pizzafactory;

/**
 * <p>project: headFirst
 * <p>ClassName: NewPizzaStore
 * <p>Description:
 * <p>Date: 11/14/2021 20:57
 *
 * @author : Zhao Li
 */
public abstract class NewPizzaStore {

    public NewPizza orderPizza(IngredientEnum item) {
        NewPizza pizza = createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract NewPizza createPizza(IngredientEnum item);
}
