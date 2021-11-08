package com.example.headfirst.duck;

import com.example.headfirst.duck.fly.FlyWithWings;
import com.example.headfirst.duck.quack.Squeak;

/**
 * Package: com.example.headfirst.duck
 * <p>Description:
 * <p>User: lizhao 2021/11/6
 */
public class FlyableDuck extends Duck{

    public FlyableDuck() {
        flyAction = new FlyWithWings();
        quackAction = new Squeak();
    }

    @Override
    public void swim() {
        System.out.print("会飞的");
        super.swim();
    }

    @Override
    public void display() {
        System.out.print("会飞的");
        super.display();
    }
}
