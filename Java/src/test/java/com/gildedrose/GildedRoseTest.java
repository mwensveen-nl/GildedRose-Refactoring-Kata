package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
    }

    @Test
    void agedBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
    }

    @Test
    void agedBrieQualityNotMoreThan50() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 48) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
        app.updateQuality();
        assertEquals(3, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
        app.updateQuality();
        assertEquals(2, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void sulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
    }
}
