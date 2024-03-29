package com.example.headfirst.factory.bean;

/**
 * <p>project: headFirst
 * <p>ClassName: ChessPizza
 * <p>Description:
 * <p>Date: 11/14/2021 15:50
 *
 * @author : Zhao Li
 */
public class ChessPizza extends Pizza {

    {
        name = "起司披萨";
        dough = "默认面饼";
        sauce = "默认酱料";
    }

    @Override
    public void prepare() {
        super.prepare();
    }

    @Override
    public void bake() {
        super.bake();
    }

    @Override
    public void cut() {
        super.cut();
    }

    @Override
    public void box() {
        super.box();
    }
}
