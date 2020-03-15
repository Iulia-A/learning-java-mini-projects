package com.miniapps.deviceconnection;

public class Phone implements IConnectable {
    private String name;
    private String operatingSystem;
    private double internalStorageGB;
    private double displaySizeInch;

    public Phone(String name, String operatingSystem, double internalStorageGB, double displaySizeInch) {
        if (name.equals(null) || name.isEmpty()) {
            throw new IllegalArgumentException("This product must have a name!");
        }
        this.name = name;

        if (operatingSystem.equals(null) || operatingSystem.isEmpty()) {
            throw new IllegalArgumentException("This product must have an operating system!");
        }
        this.operatingSystem = operatingSystem;

        if (internalStorageGB <= 0) {
            throw new IllegalArgumentException("Invalid value for internal storage in GB!");
        }
        this.internalStorageGB = internalStorageGB;

        if (displaySizeInch <= 0) {
            throw new IllegalArgumentException("I want to know if the phone fits in my pocket. Please enter the correct value!");
        }
        this.displaySizeInch = displaySizeInch;
    }


    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress ... " + getClass().getSimpleName());
    }
}
