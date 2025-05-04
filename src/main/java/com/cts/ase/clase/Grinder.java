package com.cts.ase.clase;

public class Grinder {
    public GroundCoffee grind(CoffeeBean beans, int quantityCoffee) {
        return new GroundCoffee(beans.getName(), quantityCoffee);
    }
}
