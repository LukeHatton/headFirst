package com.example.headfirst.duck;

import com.example.headfirst.duck.fly.FlyAction;
import com.example.headfirst.duck.quack.QuackAction;

/**
 * Package: com.example.headfirst.duck
 * <p>Description:抽象类：鸭子
 * <p>现在想一想，需要添加两个新的鸭子实现类：会飞的鸭子，和橡皮鸭子。会飞的鸭子能飞，橡皮鸭子叫声和其他鸭子不一样，
 * 那么改怎么实现呢？
 * <p>一般有两种实现途径：
 * <p>（一）修改{@link Duck}源码，在里面新增方法"飞行"，然后所有实现类都重写此方法。
 * <p>（二）将飞行和叫声方法抽取出来，作为不同的接口，然后提供几个实现类，这样就实现了行为的复用，每个鸭子的子类不需要单独实现
 * 自己的对应行为
 * <p>两种方法对比一下，明显方法二要比方法一好得多，因为总是要考虑到扩展的问题，方法一的实现方式根本不是面向对象编程，而是
 * 面向过程，这种写法和用Java用C来实现有什么区别?
 * <p>User: lizhao 2021/11/6
 */
public abstract class Duck {

    FlyAction flyAction;

    QuackAction quackAction;

    public Duck() {
    }

    public Duck(FlyAction flyAction, QuackAction quackAction) {
        this.flyAction = flyAction;
        this.quackAction = quackAction;
    }

    public void fly() {
        flyAction.fly();
    }

    public void quack() {
        quackAction.quack();
    }

    public void swim() {
        System.out.println("鸭子游泳");
    }

    public void display() {
        System.out.println("鸭子展示");
    }

    public FlyAction getFlyAction() {
        return flyAction;
    }

    public void setFlyAction(FlyAction flyAction) {
        this.flyAction = flyAction;
    }

    public QuackAction getQuackAction() {
        return quackAction;
    }

    public void setQuackAction(QuackAction quackAction) {
        this.quackAction = quackAction;
    }
}
