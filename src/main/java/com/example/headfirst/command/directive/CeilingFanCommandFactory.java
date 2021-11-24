package com.example.headfirst.command.directive;

import com.example.headfirst.command.directive.CeilingFan.FanSpeedEnum;
import lombok.SneakyThrows;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>project: headFirst
 * <p>ClassName: CeilingFanCommandFactory
 * <p>Description:生成风扇转速命令对象的工厂类
 * <p>Date: 11/23/2021 23:18
 *
 * @author : Zhao Li
 */
public class CeilingFanCommandFactory {

    /* 根据传入的参数(须是接口类型),生成一个接口的代理类 */
    @SneakyThrows
    @SuppressWarnings("unchecked")
    public static <T> T getProxyInstance(Class<T> clz, Class<? extends CeilingFanCommand> fanCommand, CeilingFan ceilingFan, FanSpeedEnum speed) {
        T proxyInstance = (T) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{clz},
                new MyInvocationHandler(fanCommand.getDeclaredConstructor(CeilingFan.class)
                        .newInstance(ceilingFan), speed));
        return proxyInstance;
    }

}

class MyInvocationHandler implements InvocationHandler {

    private final CeilingFanCommand ceilingFanCommand;

    private final FanSpeedEnum speed;

    public MyInvocationHandler(CeilingFanCommand ceilingFanCommand, FanSpeedEnum speed) {
        this.ceilingFanCommand = ceilingFanCommand;
        this.speed = speed;
    }

    /**
     * 对风速改变方法{@link CeilingFanCommand#execute()}进行增强
     *
     * @param proxy  代理对象
     * @param method 代理方法
     * @param args   代理参数
     * @return 动态生成的代理对象
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // SpeedChange annotation = proxy.getClass().getMethod(method.getName()).getAnnotation(SpeedChange.class);
        SpeedChange annotation = method.getAnnotation(SpeedChange.class);
        if (annotation != null) {
            switch (speed) {
                case HIGH:
                    ceilingFanCommand.high();
                    break;
                case MEDIUM:
                    ceilingFanCommand.medium();
                    break;
                case LOW:
                    ceilingFanCommand.low();
                    break;
                case OFF:
                    ceilingFanCommand.off();
                    break;
            }
        }
        return method.invoke(ceilingFanCommand, args);
    }
}
