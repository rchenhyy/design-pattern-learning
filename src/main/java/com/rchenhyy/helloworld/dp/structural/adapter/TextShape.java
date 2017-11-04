package com.rchenhyy.helloworld.dp.structural.adapter;

import javafx.util.Pair;

/**
 * 使用"类适配器"结构实现的TextShape
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/4
 */
public class TextShape extends TextView implements Shape {
    @Override
    public Pair<Point, Point> boundingBox() {
        // implements this method using TextView (adaptee)
        Point bottomLeft = getOrigin();
        Point topRight = new Point(bottomLeft.getX() + getWidth(), bottomLeft.getY() + getHeight());
        return new Pair<>(bottomLeft, topRight);
    }

    @Override
    public Manipulator createManipulator() {
        // implements this method which is not within TextView's interface
        return new TextManipulator();
    }

    // implicitly inherited:
    // public boolean isEmpty()
}
