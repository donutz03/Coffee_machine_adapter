package com.cts.ase.clase;

import com.cts.ase.clase.Exception.CoffeeException;
import com.cts.ase.clase.Exception.PremiumCoffeeMachine;

public class FilterCoffeeAdapter implements FilterCoffeeMachine {
    private PremiumCoffeeMachine machine;

    public FilterCoffeeAdapter(PremiumCoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public Coffee brewCoffee() {
        try {
            return machine.brewCoffee(CoffeeSelection.FILTER_COFFEE);
        } catch (CoffeeException e) {
            System.out.println("exceptie " + e);
            return null;
        }
    }
}
