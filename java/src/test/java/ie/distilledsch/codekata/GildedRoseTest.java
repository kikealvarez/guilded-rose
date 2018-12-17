package ie.distilledsch.codekata;


import ie.distilledsch.codekata.model.Item;
import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void testPlaceholder() {
    Item[] items = new Item[]{new Item("foo", 0, 0)};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals("foo", app.items[0].name);
  }

  @Test
  public void testItemQualityDecreases() {
    Item[] items = new Item[]{new Item("foo", 5, 5, Item.decreaseDefault())};



    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(4, app.items[0].sellIn);
    Assert.assertEquals(4, app.items[0].quality);
  }

  @Test
  public void testItemQualityNeverNegative() {
    Item[] items = new Item[]{new Item("foo", 1, 0)};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(0, app.items[0].quality);
  }

  @Test
  public void testItemQualityDecreasesDoublyAfterSellingDate() {
    Item[] items = new Item[]{new Item("foo", 1, 4,Item.decreaseDefault())};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(2, app.items[0].quality);
  }

  @Test
  public void testBrieIncreasesBy2IfDate10orLessEveryDay() {
    Item[] items = new Item[]{new Item("Aged Brie", 10, 4,Item.increaseDefault())};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(5, app.items[0].quality);
  }

  @Test
  public void testItemDOntIncreaseOver50() {
    Item[] items = new Item[]{new Item("Aged Brie", 10, 49,Item.increaseDefault())};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(50, app.items[0].quality);
  }

  @Test
  public void testSulfuraKeepsQuality() {
    Item[] items = new Item[]{new Item("Sulfuras", 10, 10)};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(10, app.items[0].quality);
  }

  @Test
  public void testBpIncreasesBy2IfDate10orLessEveryDay() {
    Item[] items = new Item[]{new Item("Backstage passes", 10, 4)};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(6, app.items[0].quality);
  }

  @Test
  public void testBpIncreasesBy3IfDate10orLessEveryDay() {
    Item[] items = new Item[]{new Item("Backstage passes", 5, 4)};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(7, app.items[0].quality);
  }

  @Test
  public void testBpDropTo0AfterSellingDate() {
    Item[] items = new Item[]{new Item("Backstage passes", 0, 4)};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(0, app.items[0].quality);
  }

  @Test
  public void testBpIncreasesBy1() {
    Item[] items = new Item[]{new Item("Backstage passes", 11, 4)};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(5, app.items[0].quality);
  }

  @Test
  public void testConjuredDecreasesBy2() {
    Item[] items = new Item[]{new Item("Conjured", 11, 4,Item.decreaseDouble())};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(2, app.items[0].quality);
  }

  @Test
  public void testConjuredNeverNegative() {
    Item[] items = new Item[]{new Item("Conjured", 11, 0,Item.decreaseDouble())};

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals(0, app.items[0].quality);
  }


}
