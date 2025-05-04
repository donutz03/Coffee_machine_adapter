package com.cts.ase.program;

import com.cts.ase.clase.CoffeeMachines.Interface.FilterCoffeeMachine;
import com.cts.ase.clase.CoffeeModel.Coffee;

public class FilterCoffeeApp {
    private FilterCoffeeMachine coffeeMachine;

    public FilterCoffeeApp(FilterCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee prepareCoffee() {
        Coffee coffee = coffeeMachine.brewCoffee();
        System.out.println("Coffee is ready!");
        System.out.println(" -> " + coffee);
        return coffee;
    }
}
