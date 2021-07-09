package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        final int waterPerCoffee = 200;
        final int milkPerCoffee = 50;
        final int beansPerCoffee = 15;

        int waterSupply = 0;
        int milkSupply = 0;
        int beansSupply = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        waterSupply = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milkSupply = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        beansSupply = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = scanner.nextInt();

        int availableWater = waterSupply / waterPerCoffee;
        int availableMilk = milkSupply / milkPerCoffee;
        int availableCoffeeBeans = beansSupply / beansPerCoffee;

        int maxCups = Math.min(Math.min(availableWater, availableMilk), availableCoffeeBeans);

        if (maxCups < cupsOfCoffee) {
            System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
        } else if (maxCups > cupsOfCoffee) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxCups - cupsOfCoffee) + " more than that)");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }
}
