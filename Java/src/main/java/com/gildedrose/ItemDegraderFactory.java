package com.gildedrose;

public class ItemDegraderFactory {

    public static ItemDegrader makeItemDegrader(Item item) {
        String name = item.name;
        return switch (name) {
            case "Aged Brie" -> new AgedBrieDegrader(item);
            case "Backstage passes to a TAFKAL80ETC concert" -> new BackstagePassesDegrader(item);
            case "Sulfuras, Hand of Ragnaros" -> new SulfurasItemDegrader(item);
            case "Conjured Mana Cake" -> new ConjuredItemDegrader(item);
            default -> new NormalItemDegrader(item);
        };
    }
}
