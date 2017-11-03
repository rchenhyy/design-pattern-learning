package com.rchenhyy.helloworld.dp.behavioral.strategy;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/3
 */
public class TeXCompositor implements Compositor {
    @Override
    public int compose(Coordinate[] natural, Coordinate[] stretch, Coordinate[] shrink, int componentCount,
            int lineWidth, int[] breaks) {
        // 每次检查一个段落, 并同时考虑到各Component的大小和伸展性
        return 0;
    }
}
