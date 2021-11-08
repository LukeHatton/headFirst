package com.example.headfirst.strategy.duck;

import com.example.headfirst.strategy.duck.fly.CantFly;
import com.example.headfirst.strategy.duck.quack.Quack;

/**
 * Package: com.example.headfirst.strategy.duck
 * <p>
 * Description:
 * <p>
 * User: lizhao 2021/11/6
 * <p>
 */
public class GreenHeadDuck extends Duck {

    {
        flyAction = new CantFly();
        quackAction = new Quack();
    }

    public GreenHeadDuck() {
    }

    @Override
    public void swim() {
        System.out.print("绿头");
        super.swim();
    }

    @Override
    public void display() {
        System.out.print("绿头");
        super.display();
    }
}
