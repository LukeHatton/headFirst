package com.example.headfirst.command;

/**
 * <p>project: headFirst
 * <p>ClassName: SimpleController
 * <p>Description:简单控制器，有一些插槽，来放置{@link Command}命令
 * <p>Date: 11/23/2021 21:23
 *
 * @author : Zhao Li
 */
public class SimpleController {
    private Command slot;

    /**
     * 设置插槽的命令
     *
     * @param command 命令
     */
    public void setCommand(Command command) {
        slot = command;
    }


    /**
     * 按下控制器按钮，交由命令对象执行命令
     */
    public void pressButton() {
        slot.execute();
    }
}
