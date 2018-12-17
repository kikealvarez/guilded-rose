package ie.distilledsch.codekata;

import ie.distilledsch.codekata.model.Item;

public class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQualityOfItemsAfterOneDayHasPassed() {
    for (int i = 0; i < items.length; i++) {

      items[i].daysPassed();

    }
  }
}
