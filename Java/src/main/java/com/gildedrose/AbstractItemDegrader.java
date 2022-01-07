package com.gildedrose;

public abstract class AbstractItemDegrader implements ItemDegrader {

    private Item item;

    public AbstractItemDegrader(Item item) {
        this.item = item;
    }

    @Override
    public final void degrade() {
        degrade(item);
    }

    protected abstract void degrade(Item item);

}
