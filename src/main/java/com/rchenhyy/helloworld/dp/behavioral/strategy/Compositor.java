package com.rchenhyy.helloworld.dp.behavioral.strategy;

/**
 * 排版器
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/2
 */
public interface Compositor {

    int compose(Coordinate[] natural, Coordinate[] stretch, Coordinate[] shrink, int componentCount, int lineWidth,
            int[] breaks);
}
