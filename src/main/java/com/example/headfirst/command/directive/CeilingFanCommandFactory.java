package com.example.headfirst.command.directive;

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
    public static <T> T getProxyInstance(Class<T> clz, Class<? extends CeilingFanCommand> fanCommand) {
        return (T) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{clz},
                new MyInvocationHandler(fanCommand.getDeclaredConstructor().newInstance()));
    }

}

class MyInvocationHandler implements InvocationHandler {

    private CeilingFanCommand ceilingFanCommand;

    public MyInvocationHandler(CeilingFanCommand ceilingFanCommand) {
        this.ceilingFanCommand = ceilingFanCommand;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
