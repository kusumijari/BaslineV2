//com.tw.salestax.Receipt displays items, their price, the total sales tax and the total amount, after computation of sales tax.

package com.tw.salestax;

public class Receipt {
    private String item;

    Receipt(String item) {
        this.item = item;
    }
    public String display(){
        return item;
    }
}
