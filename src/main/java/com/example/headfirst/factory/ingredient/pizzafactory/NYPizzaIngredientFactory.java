package com.example.headfirst.factory.ingredient.pizzafactory;

import com.example.headfirst.factory.ingredient.Cheese;
import com.example.headfirst.factory.ingredient.Clams;
import com.example.headfirst.factory.ingredient.Dough;
import com.example.headfirst.factory.ingredient.FreshClams;
import com.example.headfirst.factory.ingredient.Garlic;
import com.example.headfirst.factory.ingredient.MarinaraSauce;
import com.example.headfirst.factory.ingredient.Mushroom;
import com.example.headfirst.factory.ingredient.Onion;
import com.example.headfirst.factory.ingredient.Pepperoni;
import com.example.headfirst.factory.ingredient.PizzaIngredientFactory;
import com.example.headfirst.factory.ingredient.RedPepper;
import com.example.headfirst.factory.ingredient.ReggianCheese;
import com.example.headfirst.factory.ingredient.Sauce;
import com.example.headfirst.factory.ingredient.SlicedPepperoni;
import com.example.headfirst.factory.ingredient.ThinCrustDough;
import com.example.headfirst.factory.ingredient.Veggies;

/**
 * <p>project: headFirst
 * <p>ClassName: NYPizzaIngredientFactory
 * <p>Description:
 * <p>Date: 11/14/2021 20:21
 *
 * @author : Zhao Li
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
