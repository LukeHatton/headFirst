package com.example.headfirst.duck.quack;

/**
 * Package: com.example.headfirst.duck.quack
 * <p>Description:
 * <p>User: lizhao 2021/11/6
 */
public class Quack implements QuackAction {
    @Override
    public void quack() {
        //正常鸭子
        System.out.println("呱呱叫");
    }
}
