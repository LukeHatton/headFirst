package com.example.headfirst.command.directive;

import com.example.headfirst.command.Command;
import com.example.headfirst.command.directive.Light;

/**
 * <p>project: headFirst
 * <p>ClassName: LightOnCommand
 * <p>Description:命令：打开电灯
 * <p>Date: 11/23/2021 21:11
 *
 * @author : Zhao Li
 */
public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
