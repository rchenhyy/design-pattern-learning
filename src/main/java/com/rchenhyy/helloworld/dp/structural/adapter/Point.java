package com.rchenhyy.helloworld.dp.structural.adapter;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/4
 */
public class Point {

    private double x;

    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public Point setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Point setY(double y) {
        this.y = y;
        return this;
    }
}
