package com.company;

public class Invoice implements Payable {
    private  String partNumber ;
    private String partDescription;
    private int quantity;
    private double pricePer_item;

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
