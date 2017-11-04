package com.rchenhyy.helloworld.dp.structural.adapter;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/4
 */
public interface Manipulator<T extends Shape> {

    void manipulate(T t);
}
