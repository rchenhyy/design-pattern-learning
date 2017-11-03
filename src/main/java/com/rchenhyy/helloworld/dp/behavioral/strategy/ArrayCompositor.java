package com.rchenhyy.helloworld.dp.behavioral.strategy;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/3
 */
public class ArrayCompositor implements Compositor {
    @Override
    public int compose(Coordinate[] natural, Coordinate[] stretch, Coordinate[] shrink, int componentCount,
            int lineWidth, int[] breaks) {
        // 用规则的间距将构件分割成行
        return 0;
    }
}