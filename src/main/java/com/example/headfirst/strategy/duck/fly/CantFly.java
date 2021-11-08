package com.example.headfirst.strategy.duck.fly;

/**
 * Package: com.example.headfirst.strategy.duck.fly
 * <p>Description:
 * <p>User: lizhao 2021/11/6
 */
public class CantFly implements FlyAction {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
