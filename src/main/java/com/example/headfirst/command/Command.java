package com.example.headfirst.command;

import com.example.headfirst.command.directive.SpeedChange;

/**
 * <p>project: headFirst
 * <p>ClassName: Command
 * <p>Description:command接口
 * <p>Date: 11/23/2021 21:10
 *
 * @author : Zhao Li
 */
public interface Command {

    /**
     * 执行命令
     */
    @SpeedChange
    void execute();

    /**
     * 撤销执行命令
     */
    void undo();
}
