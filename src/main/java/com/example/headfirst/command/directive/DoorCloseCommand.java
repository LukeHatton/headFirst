package com.example.headfirst.command.directive;

import com.example.headfirst.command.Command;

/**
 * <p>project: headFirst
 * <p>ClassName: DoorCloseCommand
 * <p>Description:指令类：关闭车库门
 * <p>Date: 11/23/2021 22:37
 *
 * @author : Zhao Li
 */
public class DoorCloseCommand implements Command {
    private final GarageDoor garageDoor;

    public DoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
