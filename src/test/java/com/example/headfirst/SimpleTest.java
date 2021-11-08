package com.example.headfirst;

import com.example.headfirst.duck.Duck;
import com.example.headfirst.duck.FlyableDuck;
import com.example.headfirst.duck.GreenHeadDuck;
import com.example.headfirst.duck.RedHeadDuck;
import com.example.headfirst.duck.RubberDuck;
import com.example.headfirst.duck.SuperDuck;
import com.example.headfirst.duck.fly.FlyRocket;
import org.junit.jupiter.api.Test;

/**
 * Package: com.example.headfirst
 * <p>
 * Description:
 * <p>
 * User: lizhao 2021/11/6
 * <p>
 */
public class SimpleTest {

    /* 鸭子测试 */
    @Test
    public void test01() {
        System.out.println("==>绿头鸭子");
        Duck green = new GreenHeadDuck();
        green.fly();
        green.quack();
        green.swim();
        System.out.println("==>红头鸭子");
        Duck red = new RedHeadDuck();
        red.fly();
        red.quack();
        red.swim();
        System.out.println("==>橡皮鸭子");
        Duck rubber = new RubberDuck();
        rubber.fly();
        rubber.quack();
        rubber.swim();
        System.out.println("==>能飞的鸭子");
        Duck flyable = new FlyableDuck();
        flyable.fly();
        flyable.quack();
        flyable.swim();
        System.out.println("==>超级鸭");
        Duck superDuck = new SuperDuck();
        superDuck.fly();
        superDuck.quack();
        superDuck.swim();
        superDuck.setFlyAction(new FlyRocket());
        superDuck.fly();
    }
}
