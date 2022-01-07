package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemDegraderTest {

    @Test
    public void testDegrade() {
        Item item = new Item("foo", 5, 10);
        ItemDegrader degrader = new NormalItemDegrader(item);
        degrader.degrade();
        assertEquals("foo", item.name);
        assertEquals(4, item.sellIn);
        assertEquals(9, item.quality);
        degrader.degrade();
        degrader.degrade();
        degrader.degrade();
        assertEquals(1, item.sellIn);
        assertEquals(6, item.quality);
        degrader.degrade();
        assertEquals(0, item.sellIn);
        assertEquals(5, item.quality);
        degrader.degrade();
        assertEquals(-1, item.sellIn);
        assertEquals(3, item.quality);
    }

}
