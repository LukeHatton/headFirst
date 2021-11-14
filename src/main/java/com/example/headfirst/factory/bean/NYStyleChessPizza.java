package com.example.headfirst.factory.bean;

/**
 * <p>project: headFirst
 * <p>ClassName: NYStyleChessPizza
 * <p>Description:纽约风味起司披萨:薄饼
 * <p>Date: 11/14/2021 16:34
 *
 * @author : Zhao Li
 */
public class NYStyleChessPizza extends Pizza{
    private final Pizza chessPizza = new ChessPizza();

    {
        name = "纽约"+chessPizza.getName();
        dough = "薄脆饼";
        sauce = "美味酱料";
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
