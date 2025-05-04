package com.cts.ase.clase;

public class BrewingUnit {
    public Coffee brew(CoffeeSelection selection, GroundCoffee groundCoffee, int quantityWater) {
        return new Coffee(selection);
    }
}

