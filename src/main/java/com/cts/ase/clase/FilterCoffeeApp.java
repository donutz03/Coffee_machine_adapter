package com.cts.ase.clase;

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
