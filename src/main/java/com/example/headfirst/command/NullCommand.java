package com.example.headfirst.command;

/**
 * <p>project: headFirst
 * <p>ClassName: NullCommand
 * <p>Description:指令类：空命令。作命令槽初始占位使用
 * <p>Date: 11/23/2021 22:41
 *
 * @author : Zhao Li
 */
public class NullCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
