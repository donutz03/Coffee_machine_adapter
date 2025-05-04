package com.cts.ase.clase.CoffeeMachines.PremiumCoffeeMachine;

import com.cts.ase.clase.CoffeeModel.CoffeeBean;
import com.cts.ase.clase.CoffeeModel.GroundCoffee;

//only part of premium coffee machine
public class Grinder {
    public GroundCoffee grind(CoffeeBean beans, int quantityCoffee) {
        return new GroundCoffee(beans.getName(), quantityCoffee);
    }
}
