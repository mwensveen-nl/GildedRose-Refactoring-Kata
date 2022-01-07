package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            switch (item.name) {
                case "Aged Brie":
                    updateAgedBrie(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstagePasses(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    updateSulfuras(item);
                    break;
                default:
                    updateNormal(item);
            }
        }
    }

    private void updateNormal(Item item) {
        new NormalItemDegrader(item).degrade();
    }

    private void updateSulfuras(Item item) {
        new SulfurasItemDegrader(item).degrade();
    }

    private void updateBackstagePasses(Item item) {
        new BackstagePassesDegrader(item).degrade();
    }

    private void updateAgedBrie(Item item) {
        new AgedBrieDegrader(item).degrade();
    }
}