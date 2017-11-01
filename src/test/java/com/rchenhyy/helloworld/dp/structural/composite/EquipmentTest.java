package com.rchenhyy.helloworld.dp.structural.composite;

import com.google.common.base.Strings;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Iterator;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/1
 */
public class EquipmentTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {
        Cabinet cabinet = new Cabinet("PC Cabinet");

        // add 1
        cabinet.add(new Chassis("PC Chassis"));
        // add 2
        Bus bus = new Bus("MCA Bus");
        bus.add(new Card("16Mbs Token Ring", 999, BigDecimal.valueOf(128), BigDecimal.valueOf(100)));
        bus.add(new Card("16Mbs Token Ring 2", 1200, BigDecimal.valueOf(150), BigDecimal.valueOf(120)));
        cabinet.add(bus);
        // add 3
        cabinet.add(new FloppyDisk("3.5in Floppy", 1000, BigDecimal.valueOf(300), BigDecimal.valueOf(300)));

        // 遍历
        walk(cabinet, 0);
    }

    private void walk(Equipment equipment, int level) {
        print(equipment, level);
        if (equipment instanceof CompositeEquipment) {
            Iterator<Equipment> iterator = equipment.iterator();
            while (iterator.hasNext()) {
                walk(iterator.next(), level + 1);
            }
        }
    }

    private void print(Equipment equipment, int level) {
        String indent = Strings.repeat("\t", level);
        logger.info("{}Equipment: name={}, power={}, netPrice={}, discountPrice={}", indent, equipment.name(),
                equipment.power(), equipment.netPrice(), equipment.discountPrice());
    }
}