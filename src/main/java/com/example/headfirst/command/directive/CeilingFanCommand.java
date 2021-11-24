package com.example.headfirst.command.directive;

import com.example.headfirst.command.Command;
import com.example.headfirst.command.directive.CeilingFan.FanSpeedEnum;

/**
 * <p>project: headFirst
 * <p>ClassName: CeilingFanCommand
 * <p>Description:指令类：调整风扇转速。使用动态代理实现。好处是如果有新增的速度档位，不需要再去新建类，防止类爆炸的产生<br>
 * 但是这会不会引入过高的复杂度？可能只是一个取舍问题
 * <p>Date: 11/23/2021 23:16
 *
 * @author : Zhao Li
 */
public class CeilingFanCommand implements Command {
    private CeilingFan ceilingFan;

    private FanSpeedEnum previousSpeed;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    @SpeedChange
    public void execute() {
        //TODO 使用动态代理决定风扇速度，避免类爆炸
        // 有几个枚举类型,就会生成几个对应的代理类。
        // 应该是通过传入枚举参数，由工厂类来决定如何进行方法增强
        // 再想一想，是否应该使用工厂来做？AOP是否是更好的选择？
        // 如果用工厂类做，需要增强的方法上就需要有一个注解，否则动态代理会增强subject的所有方法
        //记录上一次的速度，以便撤销undo操作调用
        previousSpeed = FanSpeedEnum.getByValue(ceilingFan.getSpeed());
    }

    @Override
    public void undo() {
        switch (previousSpeed) {
            case HIGH:
                high();
                break;
            case MEDIUM:
                medium();
                break;
            case LOW:
                low();
                break;
            case OFF:
                off();
                break;
        }
    }

    public void high() {
        ceilingFan.high();
    }

    public void medium() {
        ceilingFan.medium();
    }

    public void low() {
        ceilingFan.low();
    }

    public void off() {
        ceilingFan.off();
    }

}
