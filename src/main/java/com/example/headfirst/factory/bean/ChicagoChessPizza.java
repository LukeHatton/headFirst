package com.example.headfirst.factory.bean;

/**
 * <p>project: headFirst
 * <p>ClassName: ChicagoChessPizza
 * <p>Description:芝加哥风味起司披萨:厚饼
 * <p>Date: 11/14/2021 16:37
 *
 * @author : Zhao Li
 */
public class ChicagoChessPizza extends Pizza{
    private final Pizza chessPizza = new ChessPizza();

    {
        name = "芝加哥" + chessPizza.getName();
        dough = "厚面饼";
        sauce = "浓芝士";
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
