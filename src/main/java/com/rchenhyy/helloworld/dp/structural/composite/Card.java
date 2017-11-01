package com.rchenhyy.helloworld.dp.structural.composite;

import java.math.BigDecimal;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/1
 */
public class Card extends LeafEquipment {

    public Card(String name, int power, BigDecimal netPrice, BigDecimal discountPrice) {
        super(name, power, netPrice, discountPrice);
    }
}
