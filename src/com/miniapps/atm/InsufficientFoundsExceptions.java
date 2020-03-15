package com.miniapps.atm;

public class InsufficientFoundsExceptions extends RuntimeException {
    private Double amount;

    public InsufficientFoundsExceptions(Double amount) {
        this.amount = amount;
    }

    public Double getAmount(){
        return amount;
    }

}