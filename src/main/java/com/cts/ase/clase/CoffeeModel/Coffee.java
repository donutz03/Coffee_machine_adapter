package com.cts.ase.clase.CoffeeModel;

public class Coffee {
    private CoffeeType selection;

    public Coffee(CoffeeType selection) {
        this.selection = selection;
    }

    @Override
    public String toString() {
        return "Coffee{" + "selection=" + selection + '}';
    }
}
