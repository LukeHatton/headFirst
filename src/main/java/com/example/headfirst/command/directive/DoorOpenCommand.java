package com.example.headfirst.command.directive;

import com.example.headfirst.command.Command;

/**
 * <p>project: headFirst
 * <p>ClassName: DoorOpenCommand
 * <p>Description:
 * <p>Date: 11/23/2021 21:40
 *
 * @author : Zhao Li
 */
public class DoorOpenCommand implements Command {
    private final GarageDoor garageDoor;

    public DoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
