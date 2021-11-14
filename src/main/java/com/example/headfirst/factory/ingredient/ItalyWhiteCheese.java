package com.example.headfirst.factory.ingredient;

/**
 * <p>project: headFirst
 * <p>ClassName: ItalyWhiteCheese
 * <p>Description:
 * <p>Date: 11/14/2021 20:40
 *
 * @author : Zhao Li
 */
public class ItalyWhiteCheese extends Cheese {
    @Override
    public String getName() {
        return "意大利白" + super.getName();
    }
}
