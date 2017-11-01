package com.rchenhyy.helloworld.dp.structural.composite;

import java.math.BigDecimal;
import java.util.Iterator;

/**
 * 非组合设备
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/1
 */
public abstract class LeafEquipment implements Equipment {

    private final String name;

    private final int power;

    private final BigDecimal netPrice;

    private final BigDecimal discountPrice;

    public LeafEquipment(String name, int power, BigDecimal netPrice, BigDecimal discountPrice) {
        this.name = name;
        this.power = power;
        this.netPrice = netPrice;
        this.discountPrice = discountPrice;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int power() {
        return power;
    }

    @Override
    public BigDecimal netPrice() {
        return netPrice;
    }

    @Override
    public BigDecimal discountPrice() {
        return discountPrice;
    }

    public void add(Equipment equipment) {
        throw new UnsupportedOperationException();
    }

    public void remove(Equipment equipment) {
        throw new UnsupportedOperationException();
    }

    public Iterator<Equipment> iterator() {
        throw new UnsupportedOperationException();
    }
}
