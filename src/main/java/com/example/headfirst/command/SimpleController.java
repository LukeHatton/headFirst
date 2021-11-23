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
    /* 接下来要执行的命令 */
    private Command slot;

    /* 上一次执行的命令，用来执行撤销操作 */
    private Command undoCommand = new NullCommand();

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
        undoCommand = slot;
    }

    /**
     * 按下撤销按钮，执行上一个命令的撤销动作
     */
    public void pressUndoButton(){
        undoCommand.undo();
    }
}
