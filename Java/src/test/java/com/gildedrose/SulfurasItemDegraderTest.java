package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasItemDegraderTest {

    @Test
    public void testDegrade() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 10);
        ItemDegrader degrader = new SulfurasItemDegrader(item);
        degrader.degrade();
        assertEquals("Sulfuras, Hand of Ragnaros", item.name);
        assertEquals(5, item.sellIn);
        assertEquals(10, item.quality);
    }

}
