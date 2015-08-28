//com.tw.salestax.Receipt displays items, their price, the total sales tax and the total amount, after computation of sales tax.

package com.tw.salestax;

public class Receipt {
    private String details;


    Receipt(String details) {
        this.details = details;
    }

    public String display(){
        return details;
    }
}
