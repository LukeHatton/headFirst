package com.example.headfirst.duck.quack;

/**
 * Package: com.example.headfirst.duck.quack
 * <p>Description:
 * <p>User: lizhao 2021/11/6
 */
public class NoQuack implements QuackAction {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
