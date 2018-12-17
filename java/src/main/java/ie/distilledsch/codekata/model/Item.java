package ie.distilledsch.codekata.model;

import java.util.function.Consumer;

/**
 * Do not change this class for this exercise
 */
public class Item {

  public String name;
  public int sellIn;
  public int quality;

  public Consumer<Item> behavior;

  public Item(String name, int sellIn, int quality, Consumer<Item> behavior) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
    this.behavior = behavior;
  }

  public Item(String name, int sellIn, int quality) {
    this(name, sellIn, quality, item -> {});
  }

  @Override
  public String toString() {
    return this.name + ", " + this.sellIn + ", " + this.quality;
  }

  public void daysPassed() {
    this.sellIn = this.sellIn - 1;
    behavior.accept(this);
  }

  public static Consumer<Item> decreaseDefault() {
    return item -> {
      if (item.sellIn == 0) {
        item.quality -= 2;
      } else {
        item.quality -= 1;
      }
    };
  }

  public static Consumer<Item> increaseDefault() {
    return item -> {
      if (item.quality <= 50) {
        item.quality += 1;
      }
    };
  }

  public static Consumer<Item> decreaseDouble() {
    return item -> item.quality -= 2;
  }
}
