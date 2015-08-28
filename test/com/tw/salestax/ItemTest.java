package com.tw.salestax;

import static org.junit.Assert.*;
import org.junit.Test;

public class ItemTest {

    @Test
    public void shoudlHaveItemName(){
        Item item = new Item("This is a string");

        assertEquals("This is a string", item.compute());
    }
}
