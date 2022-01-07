package com.gildedrose;

public class SulfurasItemDegrader implements ItemDegrader {

    private final Item item;

    public SulfurasItemDegrader(Item item) {
        this.item = item;
    }

    @Override
    public void degrade() {
        // nothing to do
    }

}
