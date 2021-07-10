package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int waterSupply = 400;
    static int milkSupply = 540;
    static int beansSupply = 120;
    static int cupsSupply = 9;
    static int money = 550;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //printStatus();
        boolean exitStatus = false;
        while(!exitStatus) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printStatus();
                    break;
                case "exit":
                    exitStatus = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                buyEspresso();
                break;
            case "2":
                buyLatte();
                break;
            case "3":
                buyCappuccino();
                break;
            default:
                break;
        }

    }


    public static void printStatus() {
        System.out.println("\nThe coffee machine has:\n" +
                waterSupply + " ml of water\n" +
                milkSupply + " ml of milk\n" +
                beansSupply + " g of coffee beans\n" +
                cupsSupply + " disposable cups\n" +
                "$" + money + " of money\n");

    }
    public static void buyEspresso() {
        int waterPerCoffee = 250;
        int beansPerCoffee = 16;
        int cost = 4;
        if (waterSupply >= waterPerCoffee && beansSupply >= beansPerCoffee && cupsSupply >= 1) {
            System.out.println("I have enough resources, making you a coffee!\n");
            waterSupply -= waterPerCoffee;
            beansSupply -= beansPerCoffee;
            money += cost;
            cupsSupply--;
        } else if (waterSupply < waterPerCoffee) {
            System.out.println("Sorry, not enough water!\n");
        } else if (beansSupply < beansPerCoffee) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else {
            System.out.println("Sorry, not enough cups!\n");
        }
    }

    private static void buyLatte() {
        int waterPerCoffee = 350;
        int milkPerCoffee = 75;
        int beansPerCoffee = 20;
        int cost = 7;

        if (waterSupply >= waterPerCoffee && beansSupply >= beansPerCoffee && milkSupply >= milkPerCoffee && cupsSupply >= 1) {
            System.out.println("I have enough resources, making you a coffee!\n");
            waterSupply -= waterPerCoffee;
            beansSupply -= beansPerCoffee;
            milkSupply -= milkPerCoffee;
            money += cost;
            cupsSupply--;
        } else if (waterSupply < waterPerCoffee) {
            System.out.println("Sorry, not enough water!\n");
        } else if (beansSupply < beansPerCoffee) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (cupsSupply < 1) {
            System.out.println("Sorry, not enough cups!\n");
        } else {
            System.out.println("Sorry, not enough milk!\n");
        }
    }

    private static void buyCappuccino() {
        int waterPerCoffee = 200;
        int milkPerCoffee = 100;
        int beansPerCoffee = 12;
        int cost = 6;

        if (waterSupply >= waterPerCoffee && beansSupply >= beansPerCoffee && milkSupply >= milkPerCoffee && cupsSupply >= 1) {
            System.out.println("I have enough resources, making you a coffee!\n");
            waterSupply -= waterPerCoffee;
            beansSupply -= beansPerCoffee;
            milkSupply -= milkPerCoffee;
            money += cost;
            cupsSupply--;
        } else if (waterSupply < waterPerCoffee) {
            System.out.println("Sorry, not enough water!\n");
        } else if (beansSupply < beansPerCoffee) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (cupsSupply < 1) {
            System.out.println("Sorry, not enough cups!\n");
        } else {
            System.out.println("Sorry, not enough milk!\n");
        }
    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        waterSupply += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milkSupply += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        beansSupply += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        cupsSupply += scanner.nextInt();
        scanner.nextLine();
    }

    private static void take() {
        System.out.println("I gave you $" + money + "\n");
        money = 0;
    }
}
