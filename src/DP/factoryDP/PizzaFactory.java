package DP.factoryDP;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("Margherita")) {
            return new MargheritaPizza();
        } else if (type.equalsIgnoreCase("Pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equalsIgnoreCase("VeggieSupreme")) {
            return new VeggieSupremePizza();
        } else {
            return null;
        }
    }
}

