package DP.factoryDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Pizza Store!");

        System.out.println("Enter the type of pizza you want (Margherita/Pepperoni/VeggieSupreme):");
        String pizzaType = br.readLine();

        Pizza pizza = PizzaFactory.createPizza(pizzaType);

        if (pizza != null) {
            System.out.println("Here's your pizza:");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Sorry, we don't have that type of pizza.");
        }
    }
}

