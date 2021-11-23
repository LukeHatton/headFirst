package com.example.headfirst.command.directive;

import com.example.headfirst.command.Command;

/**
 * <p>project: headFirst
 * <p>ClassName: LightOffCommand
 * <p>Description:指令类：关闭电灯
 * <p>Date: 11/23/2021 22:37
 *
 * @author : Zhao Li
 */
public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
