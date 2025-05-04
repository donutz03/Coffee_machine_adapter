package com.cts.ase.program;

import com.cts.ase.clase.CoffeeMachines.BasicCoffeeMachine;
import com.cts.ase.clase.CoffeeMachines.Adapter.FilterCoffeeAdapter;
import com.cts.ase.clase.CoffeeMachines.Interface.FilterCoffeeMachine;
import com.cts.ase.clase.CoffeeMachines.PremiumCoffeeMachine.PremiumCoffeeMachine;
import com.cts.ase.clase.CoffeeModel.CoffeeBean;
import com.cts.ase.clase.CoffeeModel.CoffeeType;
import com.cts.ase.clase.CoffeeModel.GroundCoffee;
import com.cts.ase.clase.Exception.CoffeeException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example 1: Using Premium Coffee Machine with Adapter");
        Map<CoffeeType, CoffeeBean> premiumBeans = new HashMap<>();
        premiumBeans.put(CoffeeType.FILTER_COFFEE, new CoffeeBean("Premium beans", 1000));
        premiumBeans.put(CoffeeType.ESPRESSO, new CoffeeBean("Espresso beans", 500));

        PremiumCoffeeMachine premiumMachine = new PremiumCoffeeMachine(premiumBeans);
        FilterCoffeeMachine adapter = new FilterCoffeeAdapter(premiumMachine);
        FilterCoffeeApp app = new FilterCoffeeApp(adapter);
        app.prepareCoffee();

        System.out.println("\nExample 2: Using Basic Coffee Machine directly");
        Map<CoffeeType, GroundCoffee> basicBeans = new HashMap<>();
        basicBeans.put(CoffeeType.FILTER_COFFEE, new GroundCoffee("Basic beans", 1000));
        
        BasicCoffeeMachine basicMachine = new BasicCoffeeMachine(basicBeans);
        FilterCoffeeApp basicApp = new FilterCoffeeApp(basicMachine);
        basicApp.prepareCoffee();

        System.out.println("\nExample 3: Trying to add different types of coffee beans");
        try {
            premiumMachine.addCoffeeBeans(CoffeeType.FILTER_COFFEE, new CoffeeBean("Different beans", 500));
        } catch (CoffeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
