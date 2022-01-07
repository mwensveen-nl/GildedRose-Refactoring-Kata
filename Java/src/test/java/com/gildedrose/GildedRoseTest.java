package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 5, 10), new Item("foo2", 7, 12) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("foo", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);

        assertEquals("foo2", app.items[1].name);
        assertEquals(6, app.items[1].sellIn);
        assertEquals(11, app.items[1].quality);
    }
}
