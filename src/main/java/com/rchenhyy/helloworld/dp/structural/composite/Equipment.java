package com.rchenhyy.helloworld.dp.structural.composite;

import java.math.BigDecimal;
import java.util.Iterator;

/**
 * 设备
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/1
 */
public interface Equipment {

    // 叶子节点方法

    String name();

    int power();

    BigDecimal netPrice();

    BigDecimal discountPrice();

    // 非叶子节点方法

    void add(Equipment equipment);

    void remove(Equipment equipment);

    Iterator<Equipment> iterator();
}
