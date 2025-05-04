package com.cts.ase.clase.CoffeeMachines;

import com.cts.ase.clase.CoffeeModel.Coffee;
import com.cts.ase.clase.CoffeeModel.CoffeeType;
import com.cts.ase.clase.CoffeeModel.GroundCoffee;

//is part of both basic and premium
public class BrewingUnit {
    public Coffee brew(CoffeeType selection, GroundCoffee groundCoffee, int quantityWater) {
        return new Coffee(selection);
    }
}

