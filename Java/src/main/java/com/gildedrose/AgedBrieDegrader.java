package com.gildedrose;

public class AgedBrieDegrader extends AbstractItemDegrader implements ItemDegrader {

    public AgedBrieDegrader(Item item) {
        super(item);
    }

    @Override
    protected void degrade(Item item) {
        item.quality = item.quality + 1;
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = item.quality + 1;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }

    }

}
