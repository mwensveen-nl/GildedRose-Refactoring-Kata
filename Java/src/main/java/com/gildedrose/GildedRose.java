package com.gildedrose;

import java.util.Arrays;
import java.util.List;

class GildedRose {
    Item[] items;
    private List<ItemDegrader> degraders;

    public GildedRose(Item[] items) {
        this.items = items;
        degraders = Arrays.stream(items).map(item -> ItemDegraderFactory.makeItemDegrader(item)).toList();
    }

    public void updateQuality() {
        degraders.forEach(d -> d.degrade());
    }

}