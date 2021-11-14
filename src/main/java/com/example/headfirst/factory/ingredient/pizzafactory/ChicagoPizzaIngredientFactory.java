package com.example.headfirst.factory.ingredient.pizzafactory;

import com.example.headfirst.factory.ingredient.BlackOlive;
import com.example.headfirst.factory.ingredient.Cheese;
import com.example.headfirst.factory.ingredient.Clams;
import com.example.headfirst.factory.ingredient.Dough;
import com.example.headfirst.factory.ingredient.Eggplant;
import com.example.headfirst.factory.ingredient.FrozenClams;
import com.example.headfirst.factory.ingredient.ItalyWhiteCheese;
import com.example.headfirst.factory.ingredient.Pepperoni;
import com.example.headfirst.factory.ingredient.PizzaIngredientFactory;
import com.example.headfirst.factory.ingredient.Sauce;
import com.example.headfirst.factory.ingredient.SlicedPepperoni;
import com.example.headfirst.factory.ingredient.Spinach;
import com.example.headfirst.factory.ingredient.ThickDough;
import com.example.headfirst.factory.ingredient.TomatoSauce;
import com.example.headfirst.factory.ingredient.Veggies;

/**
 * <p>project: headFirst
 * <p>ClassName: ChicagoPizzaIngredientFactory
 * <p>Description:
 * <p>Date: 11/14/2021 20:22
 *
 * @author : Zhao Li
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ItalyWhiteCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Eggplant(), new Spinach(), new BlackOlive()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
