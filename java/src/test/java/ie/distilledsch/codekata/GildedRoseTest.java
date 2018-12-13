package ie.distilledsch.codekata;

import ie.distilledsch.codekata.model.Item;
import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {

  @Test
  public void testPlaceholder() {
    Item[] items = new Item[] { new Item("foo", 0, 0) };

    GildedRose app = new GildedRose(items);

    app.updateQualityOfItemsAfterOneDayHasPassed();

    Assert.assertEquals("fixme", app.items[0].name);
  }

}
