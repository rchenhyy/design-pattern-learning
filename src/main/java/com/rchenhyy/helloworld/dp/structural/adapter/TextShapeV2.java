package com.rchenhyy.helloworld.dp.structural.adapter;

import javafx.util.Pair;

/**
 * 使用"对象适配器"结构实现的TextShape
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/4
 */
public class TextShapeV2 implements Shape {

    private TextView textView;

    public TextShapeV2(TextView textView) {
        this.textView = textView;
    }

    @Override
    public Pair<Point, Point> boundingBox() {
        Point bottomLeft = textView.getOrigin();
        Point topRight = new Point(bottomLeft.getX() + textView.getWidth(), bottomLeft.getY() + textView.getHeight());
        return new Pair<>(bottomLeft, topRight);
    }

    @Override
    public Manipulator createManipulator() {
        return new TextManipulator();
    }

    // must implement this method explicitly, for the class is not the subclass of TextView
    @Override
    public boolean isEmpty() {
        return textView.isEmpty();
    }
}
