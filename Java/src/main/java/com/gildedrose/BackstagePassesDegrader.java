package com.gildedrose;

public class BackstagePassesDegrader extends AbstractItemDegrader implements ItemDegrader {

    public BackstagePassesDegrader(Item item) {
        super(item);
    }

    @Override
    public void degrade(Item item) {
        item.quality = item.quality + 1;
        if (item.sellIn < 11) {
            item.quality = item.quality + 1;
        }

        if (item.sellIn < 6) {
            item.quality = item.quality + 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
    }

}
