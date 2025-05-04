package com.cts.ase.clase.CoffeeMachines.Adapter;

import com.cts.ase.clase.CoffeeMachines.Interface.FilterCoffeeMachine;
import com.cts.ase.clase.CoffeeMachines.PremiumCoffeeMachine.PremiumCoffeeMachine;
import com.cts.ase.clase.CoffeeModel.Coffee;
import com.cts.ase.clase.CoffeeModel.CoffeeType;
import com.cts.ase.clase.Exception.CoffeeException;

public class FilterCoffeeAdapter implements FilterCoffeeMachine {
    private PremiumCoffeeMachine machine;

    public FilterCoffeeAdapter(PremiumCoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public Coffee brewCoffee() {
        try {
            return machine.brewCoffee(CoffeeType.FILTER_COFFEE);
        } catch (CoffeeException e) {
            System.out.println("exceptie " + e);
            return null;
        }
    }
}
