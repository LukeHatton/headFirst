package com.example.headfirst;

import com.example.headfirst.command.Command;
import com.example.headfirst.command.SimpleController;
import com.example.headfirst.command.directive.CeilingFan;
import com.example.headfirst.command.directive.CeilingFan.FanSpeedEnum;
import com.example.headfirst.command.directive.DoorOpenCommand;
import com.example.headfirst.command.directive.GarageDoor;
import com.example.headfirst.command.directive.Light;
import com.example.headfirst.command.directive.LightOnCommand;
import com.example.headfirst.decorator.LowerCaseInputStream;
import com.example.headfirst.decorator.beverage.Beverage;
import com.example.headfirst.decorator.beverage.DarkRoast;
import com.example.headfirst.decorator.beverage.Espresso;
import com.example.headfirst.decorator.beverage.HouseBlend;
import com.example.headfirst.decorator.decorator.Mocha;
import com.example.headfirst.decorator.decorator.Soy;
import com.example.headfirst.decorator.decorator.Whip;
import com.example.headfirst.factory.ingredient.BlackOlive;
import com.example.headfirst.factory.ingredient.Onion;
import com.example.headfirst.factory.ingredient.RedPepper;
import com.example.headfirst.factory.ingredient.Veggies;
import com.example.headfirst.factory.ingredient.pizzafactory.IngredientEnum;
import com.example.headfirst.factory.ingredient.pizzafactory.NewPizza;
import com.example.headfirst.factory.ingredient.pizzafactory.NewPizzaStore;
import com.example.headfirst.factory.pizza.ChicagoPizzaStore;
import com.example.headfirst.factory.pizza.NYPizzaStore;
import com.example.headfirst.factory.pizza.PizzaStore;
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
import lombok.Cleanup;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Optional;

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
    @SneakyThrows
    @Test
    public void test03() {
        /* ================咖啡================= */
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

        /* ================ LowerCaseInputStream ================= */
        // 使用自定义输入流包装器，将英文字符串转换为全小写
        @Cleanup LowerCaseInputStream in =
                new LowerCaseInputStream(
                        new BufferedInputStream(
                                new ByteArrayInputStream("IM ALL UPPER CASE STRING".getBytes())));
        StringBuilder builder = new StringBuilder();
        int c;
        while ((c = in.read()) >= 0) {
            builder.append((char) c);
        }
        System.out.println(builder);

    }

    /* 工厂模式测试 */
    @Test
    public void test04() {
        //创建工厂:披萨工厂
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        //生产产品:起司披萨
        nyPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("cheese");

    }

    /* 工厂模式:抽象工厂 */
    @Test
    public void test05() {
        NewPizzaStore pizzaStore = new com.example.headfirst.factory.ingredient.pizzafactory.NYPizzaStore();
        NewPizza pizza = pizzaStore.orderPizza(IngredientEnum.CHEESE);
        System.out.println(pizza);
    }

    @Test
    public void test06() {
        Veggies[] veggies = new Veggies[]{new BlackOlive(), new RedPepper(), new Onion()};
        String reduce = Arrays.stream(Optional.ofNullable(veggies).orElseGet(() -> new Veggies[]{}))
                .map(Veggies::getName)
                .reduce("", (a, b) -> a + b);
        System.out.println(reduce);
        System.out.println("----------------------");

        String str = null;
        System.out.println("gasjdgh" + null != str ? "" : "jkas");
    }

    /* 命令模式 */
    @Test
    public void test07() {
        //命令的请求者，即客户client
        SimpleController controller = new SimpleController();
        //命令对象，即Command
        Command lightOnCommand = new LightOnCommand(new Light());
        Command doorOpenCommand = new DoorOpenCommand(new GarageDoor());

        //由客户决定要执行的命令
        controller.setCommand(lightOnCommand);      //电灯
        //在客户方法中，调用命令对象.execute()，由命令对象真正执行客户的请求
        controller.pressButton();
        controller.pressUndoButton();
        controller.setCommand(doorOpenCommand);     //车库门
        controller.pressButton();
        controller.pressUndoButton();
    }
}
