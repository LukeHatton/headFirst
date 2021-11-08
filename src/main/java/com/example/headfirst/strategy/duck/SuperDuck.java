package com.example.headfirst.strategy.duck;

import com.example.headfirst.strategy.duck.fly.FlyWithWings;
import com.example.headfirst.strategy.duck.quack.Quack;

/**
 * Package: com.example.headfirst.strategy.duck
 * <p>Description:
 * <p>User: lizhao 2021/11/7
 */
public class SuperDuck extends Duck{

    {
        flyAction = new FlyWithWings();
        quackAction = new Quack();
    }

    @Override
    public void quack() {
        System.out.print("超级");
        super.quack();
    }

    @Override
    public void swim() {
        System.out.print("超级");
        super.swim();
    }

    @Override
    public void display() {
        System.out.print("超级");
        super.display();
    }
}
