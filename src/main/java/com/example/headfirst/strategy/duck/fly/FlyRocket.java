package com.example.headfirst.strategy.duck.fly;

/**
 * Package: com.example.headfirst.strategy.duck.fly
 * <p>Description:
 * <p>User: lizhao 2021/11/7
 */
public class FlyRocket implements FlyAction{
    @Override
    public void fly() {
        System.out.println("火箭动力飞行！");
    }
}
