package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        final int waterPerCoffee = 200;
        final int milkPerCoffee = 50;
        final int beansPerCoffee = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = scanner.nextInt();
        int water = cupsOfCoffee * waterPerCoffee;
        int milk = cupsOfCoffee * milkPerCoffee;
        int coffeeBeans = cupsOfCoffee * beansPerCoffee;

        System.out.println("For " + cupsOfCoffee + " cups of coffee you will need:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffeeBeans + " g of coffee beans\n");
//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
    }
}
