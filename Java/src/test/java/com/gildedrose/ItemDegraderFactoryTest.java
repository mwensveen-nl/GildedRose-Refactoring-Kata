package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemDegraderFactoryTest {

    @Test
    public void testAgedBrie() {
        Item item = new Item("Aged Brie", 5, 10);
        ItemDegrader degrader = ItemDegraderFactory.makeItemDegrader(item);
        assertTrue(degrader instanceof AgedBrieDegrader);
    }

    @Test
    public void testBackstagePasses() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10);
        ItemDegrader degrader = ItemDegraderFactory.makeItemDegrader(item);
        assertTrue(degrader instanceof BackstagePassesDegrader);
    }

    @Test
    public void testSulfuras() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 10);
        ItemDegrader degrader = ItemDegraderFactory.makeItemDegrader(item);
        assertTrue(degrader instanceof SulfurasItemDegrader);
    }

    @Test
    public void testConjured() {
        Item item = new Item("Conjured Mana Cake", 5, 10);
        ItemDegrader degrader = ItemDegraderFactory.makeItemDegrader(item);
        assertTrue(degrader instanceof ConjuredItemDegrader);
    }

    @Test
    public void testNormal() {
        Item item = new Item("foo", 5, 10);
        ItemDegrader degrader = ItemDegraderFactory.makeItemDegrader(item);
        assertTrue(degrader instanceof NormalItemDegrader);
    }

}
