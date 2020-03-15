package com.miniapps.restaurant;

public class FastFood extends Restaurant {
    private double tax;

    public double calculateTaxes(){
        tax = getIncome() * 0.2;
        return tax;
    }
}