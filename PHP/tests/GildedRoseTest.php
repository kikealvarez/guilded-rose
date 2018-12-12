<?php

namespace Codekata2\Tests;

use Codekata2\GildedRose;
use Codekata2\model\Item;
use PHPUnit\Framework\TestCase;

class GildedRoseTest extends TestCase
{
    public function testX()
    {
        $items = array(new Item("foo", 0, 0));

        $gildedRose = new GildedRose($items);

        $gildedRose->updateQuality();

        $this->assertEquals("fixme", $items[0]->name);
    }
}
