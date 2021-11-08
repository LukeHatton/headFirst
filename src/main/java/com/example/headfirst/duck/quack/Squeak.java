package com.example.headfirst.duck.quack;

/**
 * Package: com.example.headfirst.duck.quack
 * <p>Description:
 * <p>User: lizhao 2021/11/6
 */
public class Squeak implements QuackAction {
    @Override
    public void quack() {
        //橡皮鸭子
        System.out.println("吱吱叫");
    }
}
