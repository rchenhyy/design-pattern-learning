package com.rchenhyy.helloworld.dp.structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 组合设备
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/1
 */
public abstract class CompositeEquipment implements Equipment {

    private final String name;

    private List<Equipment> children = new ArrayList<>();

    public CompositeEquipment(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    public int power() {
        Iterator<Equipment> iterator = iterator();
        int power = 0;
        while (iterator.hasNext()) {
            Equipment next = iterator.next();
            power += next.power();
        }
        return power;
    }

    public BigDecimal discountPrice() {
        Iterator<Equipment> iterator = iterator();
        BigDecimal discountPrice = BigDecimal.ZERO;
        while (iterator.hasNext()) {
            Equipment next = iterator.next();
            discountPrice = discountPrice.add(next.discountPrice());
        }
        return discountPrice;
    }

    public BigDecimal netPrice() {
        Iterator<Equipment> iterator = iterator();
        BigDecimal netPrice = BigDecimal.ZERO;
        while (iterator.hasNext()) {
            Equipment next = iterator.next();
            netPrice = netPrice.add(next.netPrice());
        }
        return netPrice;
    }

    public void add(Equipment equipment) {
        children.add(equipment);
    }

    public void remove(Equipment equipment) {
        children.remove(equipment);
    }

    public Iterator<Equipment> iterator() {
        return children.listIterator();
    }
}
