package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassesDegraderTest {

    @Test
    public void testDegrade() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 12, 10);
        ItemDegrader degrader = new BackstagePassesDegrader(item);
        degrader.degrade();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        assertEquals(11, item.sellIn);
        assertEquals(11, item.quality);
        degrader.degrade();
        assertEquals(10, item.sellIn);
        assertEquals(12, item.quality);
        degrader.degrade();
        assertEquals(9, item.sellIn);
        assertEquals(14, item.quality);
        degrader.degrade();
        degrader.degrade();
        degrader.degrade();
        degrader.degrade();
        assertEquals(5, item.sellIn);
        assertEquals(22, item.quality);
        degrader.degrade();
        assertEquals(4, item.sellIn);
        assertEquals(25, item.quality);
        degrader.degrade();
        degrader.degrade();
        degrader.degrade();
        degrader.degrade();
        assertEquals(0, item.sellIn);
        assertEquals(37, item.quality);
        degrader.degrade();
        assertEquals(-1, item.sellIn);
        assertEquals(0, item.quality);
        degrader.degrade();
        assertEquals(-2, item.sellIn);
        assertEquals(0, item.quality);
    }

}
