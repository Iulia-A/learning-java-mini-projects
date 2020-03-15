package com.miniapps.deviceconnection;

public class Car implements IConnectable{
    private String brand;
    private String model;
    private double fuelConsumption;
    private int yearOfProduction;
    private int maximumSpeed;

    public Car(String brand, String model, double fuelConsumption, int yearOfProduction, int maximumSpeed) {
        if (brand.equals(null) || brand.isEmpty()){
            throw new IllegalArgumentException("This product must have a brand!");
        }
        this.brand = brand;

        if (model.equals(null) || model.isEmpty()){
            throw new IllegalArgumentException("This product must have a model!");
        }
        this.model = model;

        if (fuelConsumption<=0){
            throw new IllegalArgumentException("Really? Fuel consumption so low!? I don't think so. Please enter a value greater than 0!");
        }
        this.fuelConsumption = fuelConsumption;

        if (yearOfProduction<=0){
            throw new IllegalArgumentException("Come on! Cars were not invented in that era. Please enter a value greater than 0!");
        }
        this.yearOfProduction = yearOfProduction;

        if (maximumSpeed<=0){
            throw new IllegalArgumentException("Think again at the possible maximum speed. Please enter a value greater than 0!");
        }
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress ... " + getClass().getSimpleName());
    }
}
