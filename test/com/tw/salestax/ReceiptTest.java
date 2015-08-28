package com.tw.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReceiptTest {

    @Test
    public void shouldDisplayDetails() {
        Receipt receipt = new Receipt("This is an item");

        assertEquals("This is an item", receipt.display());
    }

}
