package com.cts.ase.program;

import com.cts.ase.clase.*;
import com.cts.ase.clase.Exception.PremiumCoffeeMachine;
import com.cts.ase.clase.Exception.CoffeeException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example 1: Using Premium Coffee Machine with Adapter");
        Map<CoffeeSelection, CoffeeBean> premiumBeans = new HashMap<>();
        premiumBeans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean("Premium beans", 1000));
        premiumBeans.put(CoffeeSelection.ESPRESSO, new CoffeeBean("Espresso beans", 500));

        PremiumCoffeeMachine premiumMachine = new PremiumCoffeeMachine(premiumBeans);
        FilterCoffeeMachine adapter = new FilterCoffeeAdapter(premiumMachine);
        //aici sunt
        FilterCoffeeApp app = new FilterCoffeeApp(adapter);
        app.prepareCoffee();

        System.out.println("\nExample 2: Using Basic Coffee Machine directly");
        Map<CoffeeSelection, GroundCoffee> basicBeans = new HashMap<>();
        basicBeans.put(CoffeeSelection.FILTER_COFFEE, new GroundCoffee("Basic beans", 1000));
        
        BasicCoffeeMachine basicMachine = new BasicCoffeeMachine(basicBeans);
        FilterCoffeeApp basicApp = new FilterCoffeeApp(basicMachine);
        basicApp.prepareCoffee();

        System.out.println("\nExample 3: Trying to add different types of coffee beans");
        try {
            premiumMachine.addCoffeeBeans(CoffeeSelection.FILTER_COFFEE, new CoffeeBean("Different beans", 500));
        } catch (CoffeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
