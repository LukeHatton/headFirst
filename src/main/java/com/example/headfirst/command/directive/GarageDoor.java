package com.example.headfirst.command.directive;

/**
 * <p>project: headFirst
 * <p>ClassName: GarageDoor
 * <p>Description:Receiver角色：车库门
 * <p>Date: 11/23/2021 21:37
 *
 * @author : Zhao Li
 */
public class GarageDoor {
    public void up() {
        System.out.println("door roll up!");
    }

    public void down(){
        System.out.println("door close down!");
    }
}
