package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemDegraderTest {

    @Test
    public void testDegrade() {
        Item item = new Item("Conjured Mana Cake", 5, 10);
        ItemDegrader degrader = new ConjuredItemDegrader(item);
        degrader.degrade();
        assertEquals("Conjured Mana Cake", item.name);
        assertEquals(4, item.sellIn);
        assertEquals(8, item.quality);
        degrader.degrade();
        degrader.degrade();
        degrader.degrade();
        assertEquals(1, item.sellIn);
        assertEquals(2, item.quality);
        degrader.degrade();
        assertEquals(0, item.sellIn);
        assertEquals(0, item.quality);
        degrader.degrade();
        assertEquals(-1, item.sellIn);
        assertEquals(0, item.quality);
    }

}
