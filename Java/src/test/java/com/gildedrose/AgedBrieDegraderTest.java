package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieDegraderTest {

    @Test
    public void testDegrade() {
        Item item = new Item("Aged Brie", 5, 10);
        AgedBrieDegrader degrader = new AgedBrieDegrader(item);
        degrader.degrade();
        assertEquals("Aged Brie", item.name);
        assertEquals(4, item.sellIn);
        assertEquals(11, item.quality);
        degrader.degrade();
        degrader.degrade();
        degrader.degrade();
        assertEquals(1, item.sellIn);
        assertEquals(14, item.quality);
        degrader.degrade();
        assertEquals(0, item.sellIn);
        assertEquals(15, item.quality);
        degrader.degrade();
        assertEquals(-1, item.sellIn);
        assertEquals(17, item.quality);
    }

}
