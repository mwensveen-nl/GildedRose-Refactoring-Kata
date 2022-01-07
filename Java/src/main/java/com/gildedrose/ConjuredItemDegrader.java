package com.gildedrose;

public class ConjuredItemDegrader extends AbstractItemDegrader implements ItemDegrader {

    public ConjuredItemDegrader(Item item) {
        super(item);
    }

    @Override
    protected void degrade(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 2;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 2;
            }
        }
    }

}
