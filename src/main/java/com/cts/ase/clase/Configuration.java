package com.cts.ase.clase;

public class Configuration {
    private int quantityCoffee;
    private int quantityWater;

    public Configuration(int quantityCoffee, int quantityWater) {
        this.quantityCoffee = quantityCoffee;
        this.quantityWater = quantityWater;
    }

    public int getQuantityCoffee() { return quantityCoffee; }
    public int getQuantityWater() { return quantityWater; }
}
