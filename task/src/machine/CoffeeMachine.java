package machine;

import java.util.Scanner;

enum CoffeeType {
    ESPRESSO(1, 250, 0, 16, 4),
    LATTE(2, 350, 75, 20, 7),
    CAPPUCCINO(3, 200, 100, 12, 6);

    private final int ID;
    private final int WATER_REQUIRED;
    private final int MILK_REQUIRED;
    private final int BEANS_REQUIRED;
    private final int COST;

    CoffeeType(int ID, int WATER_REQUIRED, int MILK_REQUIRED, int BEANS_REQUIRED, int COST) {
        this.ID = ID;
        this.WATER_REQUIRED = WATER_REQUIRED;
        this.MILK_REQUIRED = MILK_REQUIRED;
        this.BEANS_REQUIRED = BEANS_REQUIRED;
        this.COST = COST;
    }

    public static CoffeeType getCoffeeType(int id) {
        for (CoffeeType coffee : CoffeeType.values()) {
            if (coffee.ID == id) {
                return coffee;
            }
        }
        return null;
    }

    public int getWATER_REQUIRED() {
        return WATER_REQUIRED;
    }

    public int getMILK_REQUIRED() {
        return MILK_REQUIRED;
    }

    public int getBEANS_REQUIRED() {
        return BEANS_REQUIRED;
    }

    public int getCOST() {
        return COST;
    }
}

class CoffeeMachineWork {
    private int waterSupply;
    private int milkSupply;
    private int beansSupply;
    private int cupsSupply;
    private int money;

    public CoffeeMachineWork(int waterSupply, int milkSupply, int beansSupply, int cupsSupply, int money) {
        this.waterSupply = waterSupply;
        this.milkSupply = milkSupply;
        this.beansSupply = beansSupply;
        this.cupsSupply = cupsSupply;
        this.money = money;
    }

    public void add(int water, int milk, int beans, int cups) {
        this.waterSupply += water;
        this.milkSupply += milk;
        this.beansSupply += beans;
        this.cupsSupply += cups;
    }

    public void printStatus() {
        System.out.println("\nThe coffee machine has:\n" +
                waterSupply + " ml of water\n" +
                milkSupply + " ml of milk\n" +
                beansSupply + " g of coffee beans\n" +
                cupsSupply + " disposable cups\n" +
                "$" + money + " of money\n");
    }

    public void buy(CoffeeType coffeeType) {
        waterSupply -= coffeeType.getWATER_REQUIRED();
        milkSupply -= coffeeType.getMILK_REQUIRED();
        beansSupply -= coffeeType.getBEANS_REQUIRED();
        cupsSupply--;
        money += coffeeType.getCOST();
    }

    public void checkAvailableSupplies(CoffeeType coffeeType) {
        boolean isEnoughWater = waterSupply >= coffeeType.getWATER_REQUIRED();
        boolean isEnoughMilk = milkSupply >= coffeeType.getMILK_REQUIRED();
        boolean isEnoughBeans = beansSupply >= coffeeType.getBEANS_REQUIRED();
        if (isEnoughWater && isEnoughMilk && isEnoughBeans && cupsSupply >= 1) {
            System.out.println("I have enough resources, making you a coffee!\n");
            buy(coffeeType);
        } else if (!isEnoughWater) {
            System.out.println("Sorry, not enough water!\n");
        } else if (!isEnoughBeans) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else if (cupsSupply < 1) {
            System.out.println("Sorry, not enough cups!\n");
        } else {
            System.out.println("Sorry, not enough milk!\n");
        }
    }

    public void take() {
        System.out.println("I gave you $" + money + "\n");
        money = 0;
    }
}

public class CoffeeMachine {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CoffeeMachineWork coffeeMachine = new CoffeeMachineWork(400, 540, 120, 9, 550);

        boolean exitStatus = false;
        while(!exitStatus) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String input = scanner.nextLine();
                    if (!input.equals("back")) {
                        coffeeMachine.checkAvailableSupplies(CoffeeType.getCoffeeType(Integer.parseInt(input)));
                    }
                    break;
                case "fill":
                    fill(coffeeMachine);
                    break;
                case "take":
                    coffeeMachine.take();
                    break;
                case "remaining":
                    coffeeMachine.printStatus();
                    break;
                case "exit":
                    exitStatus = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void fill(CoffeeMachineWork coffeeMachine) {
        System.out.println("Write how many ml of water you want to add: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int cups = scanner.nextInt();
        scanner.nextLine();
        coffeeMachine.add(water, milk, beans, cups);
    }


}
