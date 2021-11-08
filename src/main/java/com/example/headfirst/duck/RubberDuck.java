package com.example.headfirst.duck;

import com.example.headfirst.duck.fly.CantFly;
import com.example.headfirst.duck.quack.NoQuack;
import com.example.headfirst.duck.quack.Squeak;

/**
 * Package: com.example.headfirst.duck
 * <p>Description:
 * <p>User: lizhao 2021/11/6
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        flyAction = new CantFly();
        quackAction = new NoQuack();
    }

    @Override
    public void swim() {
        System.out.print("橡皮");
        super.swim();
    }

    @Override
    public void display() {
        System.out.print("橡皮");
        super.display();
    }
}
