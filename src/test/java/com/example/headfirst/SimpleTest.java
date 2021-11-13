package com.example.headfirst;

import com.example.headfirst.decorator.beverage.Beverage;
import com.example.headfirst.decorator.beverage.DarkRoast;
import com.example.headfirst.decorator.beverage.Espresso;
import com.example.headfirst.decorator.beverage.HouseBlend;
import com.example.headfirst.decorator.decorator.Mocha;
import com.example.headfirst.decorator.decorator.Soy;
import com.example.headfirst.decorator.decorator.Whip;
import com.example.headfirst.strategy.duck.Duck;
import com.example.headfirst.strategy.duck.FlyableDuck;
import com.example.headfirst.strategy.duck.GreenHeadDuck;
import com.example.headfirst.strategy.duck.RedHeadDuck;
import com.example.headfirst.strategy.duck.RubberDuck;
import com.example.headfirst.strategy.duck.SuperDuck;
import com.example.headfirst.strategy.duck.fly.FlyRocket;
import com.example.headfirst.watcher.bean.WeatherInfo;
import com.example.headfirst.watcher.interFace.WeatherData;
import com.example.headfirst.watcher.observer.CurrentConditionDisplay;
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

    /* 观察者测试 */
    @Test
    public void test02() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay observer = new CurrentConditionDisplay();
        weatherData.add(observer);
        weatherData.setMeasurement(new WeatherInfo(24.4D, 0.4D, 1000D));
        observer.display();
    }

    /* 装饰者测试 */
    @Test
    public void test03() {
        //一杯Espresso，输出描述与价钱
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ", $" + espresso.cost());

        //一杯DarkRoast，双份摩卡，一份奶泡
        Beverage darkRoast = new DarkRoast();
        Beverage mocha_2 = new Mocha(new Mocha(darkRoast));
        Beverage darkRoastMochaWhip = new Whip(mocha_2);
        System.out.println(darkRoastMochaWhip.getDescription() + ", $" + darkRoastMochaWhip.cost());

        //一杯HouseBlend，加豆浆、摩卡、奶泡
        Beverage houseBlend = new HouseBlend();
        Beverage withSoy = new Soy(houseBlend);
        Beverage withMocha = new Mocha(withSoy);
        Beverage withWhip = new Whip(withMocha);
        System.out.println(withWhip.getDescription() + ", $" + withWhip.cost());
    }
}
