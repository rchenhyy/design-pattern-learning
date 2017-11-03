package com.rchenhyy.helloworld.dp.behavioral.strategy;

/**
 * 文章
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/2
 */
public class Composition {

    private Compositor compositor;

    private Component[] components;
    private int componentCount;
    private int lineWidth;

    private int[] lineBreaks;
    int lineCount;

    public Composition(Compositor compositor) {
        this.compositor = compositor;
    }

    public void repair() {
        Coordinate[] natural = new Coordinate[componentCount];
        Coordinate[] stretch = new Coordinate[componentCount];
        Coordinate[] shrink = new Coordinate[componentCount];

        // prepare the array with the desired component sizes ...

        compositor.compose(natural, stretch, shrink, componentCount, lineWidth, lineBreaks);

        // lay out components according to breaks ...
    }

}
