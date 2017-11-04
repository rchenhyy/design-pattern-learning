package com.rchenhyy.helloworld.dp.structural.adapter;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/4
 */
public class TextView implements View {

    // 此处假设TextView和TextShape使用的是相同的Point类 (实际情况中很可能是两个不兼容的Point类从而需要转换)
    @Override
    public Point getOrigin() {
        return null;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }
}
