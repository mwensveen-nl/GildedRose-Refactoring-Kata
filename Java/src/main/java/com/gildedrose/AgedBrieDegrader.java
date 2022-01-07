package com.gildedrose;

public class AgedBrieDegrader extends AbstractItemDegrader implements ItemDegrader {

    public AgedBrieDegrader(Item item) {
        super(item);
    }

    @Override
    protected void degrade(Item item) {
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
