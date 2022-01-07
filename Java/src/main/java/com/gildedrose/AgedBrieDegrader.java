package com.gildedrose;

public class AgedBrieDegrader implements ItemDegrader {
    private final Item item;

    public AgedBrieDegrader(Item item) {
        this.item = item;
    }

    @Override
    public void degrade() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

}
