package com.example.headfirst.factory.ingredient.pizzafactory;

import com.example.headfirst.factory.ingredient.Cheese;
import com.example.headfirst.factory.ingredient.Clams;
import com.example.headfirst.factory.ingredient.Dough;
import com.example.headfirst.factory.ingredient.Pepperoni;
import com.example.headfirst.factory.ingredient.Sauce;
import com.example.headfirst.factory.ingredient.Veggies;
import lombok.Data;

import java.util.Arrays;
import java.util.Optional;

/**
 * <p>project: headFirst
 * <p>ClassName: NewPizza
 * <p>Description:
 * <p>Date: 11/14/2021 20:46
 *
 * @author : Zhao Li
 */
@Data
public abstract class NewPizza {
    String name;

    Dough dough;

    Sauce sauce;

    Veggies veggies[];

    Cheese cheese;

    Pepperoni pepperoni;

    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("放入烤箱,烘烤25~30分钟");
    }

    void cut() {
        System.out.println("将披萨切成八等份");
    }

    void box() {
        System.out.println("披萨装入精美包装");
    }

    @Override
    public String toString() {
        String doughName = dough != null ? dough.getName() : "";
        String sauceName = sauce != null ? sauce.getName() : "";
        String chessName = cheese != null ? cheese.getName() : "";
        String pepperoniName = pepperoni != null ? pepperoni.getName() : "";
        String clamsName = clams != null ? clams.getName() : "";
        return "NewPizza{" +
                "name='" + name + '\'' +
                ", dough=" + doughName +
                ", sauce=" + sauceName +
                ", veggies=" + Arrays.stream(Optional.ofNullable(veggies).orElseGet(() -> new Veggies[]{}))
                .map(Veggies::getName)
                .reduce("", (a, b) -> a + b) +
                ", cheese=" + chessName +
                ", pepperoni=" + pepperoniName +
                ", clams=" + clamsName +
                '}';
    }
}
