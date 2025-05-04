package com.cts.ase.clase;

public class Coffee {
    private CoffeeSelection selection;

    public Coffee(CoffeeSelection selection) {
        this.selection = selection;
    }

    @Override
    public String toString() {
        return "Coffee{" + "selection=" + selection + '}';
    }
}
