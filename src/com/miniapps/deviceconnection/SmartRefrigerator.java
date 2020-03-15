package com.miniapps.deviceconnection;

public class SmartRefrigerator implements IConnectable {
    private String brand;
    private int numberOfDoors;
    private String color;
    private double capacity;

    public SmartRefrigerator(String brand, int numberOfDoors, String color, double capacity) {
        if (brand.equals(null) || brand.isEmpty()) {
            throw new IllegalArgumentException("This product must have a brand!");
        }
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;

        if (color.equals(null) || color.isEmpty()){
            throw new IllegalArgumentException("This product must have a color! I don't think it is invisible.");
        }
        this.color = color;

        if (capacity<=0){
            throw new IllegalArgumentException("Capacity must be greater than 0!");
        }
        this.capacity = capacity;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress ... " + getClass().getSimpleName());
    }
}
