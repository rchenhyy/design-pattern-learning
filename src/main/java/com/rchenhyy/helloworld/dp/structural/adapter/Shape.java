package com.rchenhyy.helloworld.dp.structural.adapter;

import javafx.util.Pair;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/4
 */
public interface Shape {

    Pair<Point, Point> boundingBox();

    Manipulator createManipulator();

    boolean isEmpty();
}
