package com.rchenhyy.helloworld.dp.behavioral.strategy;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/3
 */
public class SimpleCompositor implements Compositor {
    @Override
    public int compose(Coordinate[] natural, Coordinate[] stretch, Coordinate[] shrink, int componentCount,
            int lineWidth, int[] breaks) {
        // 一次检查一行Component, 并决定在哪儿换行
        return 0;
    }
}
