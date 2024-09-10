import java.util.*;

public class BudgetTool {
    public static Scanner scanner = new Scanner(System.in);
    public static double monthlyAllowance;
    public static List<BudgetItem> budgetItems = new ArrayList<>(); // List to store budget items

    // Get the Monthly Allowance
    public static double getMonthlyAllowance() {
        System.out.println("What's your Monthly Allowance for your budget?");
        monthlyAllowance = scanner.nextDouble();
        if (monthlyAllowance < 0.0) {
            System.err.println("Error! Sorry, the Monthly Allowance must be greater than zero!");
            monthlyAllowance = 0.0;
        }
        // Consume the leftover newline
        scanner.nextLine();
        return monthlyAllowance;
    }

    // Get the Budget Item(s)
    public static void getBudgetItems() {
        String name;
        double cost;
        int duration;
        String input;
        boolean exitCondition = false;

        System.out.println("Let's add a budget item.");

        while (!exitCondition) {
            System.out.println("What should we call this item?");
            name = scanner.nextLine();

            System.out.println("What's the monthly cost associated with " + name + "?");
            cost = scanner.nextDouble();

            // Consume the leftover newline
            scanner.nextLine();

            System.out.println("Does " + name + " have a duration? (Y/N)");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("Enter the duration in months:");
                duration = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                duration = 0; // No duration
            }

            // Create a new BudgetItem object and add it to the list
            BudgetItem item = new BudgetItem(name, cost, duration);
            budgetItems.add(item);

            // Subtract from the monthly allowance
            monthlyAllowance -= cost;

            System.out.println("Would you like to add another item? (Y/N)");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("N")) {
                exitCondition = true;
            }
        }
    }

    public static void main(String[] args) {
        getMonthlyAllowance();
        System.out.println("Your Monthly Allowance is $" + monthlyAllowance);
        getBudgetItems();

        System.out.println("Here's all of your Budget Items:");
        for (BudgetItem item : budgetItems) {
            System.out.println(item); // Calls the toString() method of BudgetItem
        }

        System.out.println("Your Monthly Allowance is $" + monthlyAllowance);
        System.out.println("Remaining Monthly Allowance: $" + monthlyAllowance);
    }
}