package com.example.headfirst.factory.bean;

/**
 * <p>project: headFirst
 * <p>ClassName: Pizza
 * <p>Description:
 * <p>Date: 11/14/2021 15:37
 *
 * @author : Zhao Li
 */
public abstract class Pizza {
    public void prepare() {
        System.out.print("准备");
    }

    public void bake() {
        System.out.print("烘烤");
    }

    public void cut() {
        System.out.print("切片");
    }

    public void box(){
        System.out.print("装盒");
    }

}
