package com.gildedrose;

public class NormalItemDegrader extends AbstractItemDegrader implements ItemDegrader {

    public NormalItemDegrader(Item item) {
        super(item);
    }

    @Override
    protected void degrade(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }

}
