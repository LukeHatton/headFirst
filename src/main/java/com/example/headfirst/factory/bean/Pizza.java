package com.example.headfirst.factory.bean;

import lombok.Data;

/**
 * <p>project: headFirst
 * <p>ClassName: Pizza
 * <p>Description:
 * <p>Date: 11/14/2021 15:37
 *
 * @author : Zhao Li
 */
@Data
public abstract class Pizza {

    //披萨名
    protected String name;

    //面团
    protected String dough;

    //酱料
    protected String sauce;

    public void prepare() {
        System.out.println("准备: " + this);
    }

    public void bake() {
        System.out.println("烘烤: " + this);
    }

    public void cut() {
        System.out.println("切片: " + this);
    }

    public void box() {
        System.out.println("装盒: " + this);
    }

    @Override
    public String toString() {
        return "【" + dough + "】 【" + sauce + "】 【" + name + "】";
    }

}
