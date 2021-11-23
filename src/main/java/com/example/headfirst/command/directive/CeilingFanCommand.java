package com.example.headfirst.command.directive;

import com.example.headfirst.command.Command;
import com.example.headfirst.command.directive.CeilingFan.FanSpeedEnum;

/**
 * <p>project: headFirst
 * <p>ClassName: CeilingFanCommand
 * <p>Description:指令类：调整风扇转速
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
    public void execute() {
        //TODO 使用动态代理决定风扇速度，避免类爆炸
        // 有几个枚举类型,就会生成几个对应的代理类
        //撤销操作记录上一次的速度
        previousSpeed = FanSpeedEnum.getByValue(ceilingFan.getSpeed());
    }

    @Override
    public void undo() {
        switch (previousSpeed) {
            case HIGH:
                ceilingFan.High();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
            case LOW:
                ceilingFan.low();
                break;
            case OFF:
                ceilingFan.off();
                break;
        }
    }
}
