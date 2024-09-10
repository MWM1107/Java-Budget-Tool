import java.util.*;

class BudgetItem {
    private String name;
    private double cost;
    private int duration; // in months

    // Constructor
    public BudgetItem(String name, double cost, int duration) {
        this.name = name;
        this.cost = cost;
        this.duration = duration;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name + " ($" + cost + " per month, " + (duration > 0 ? duration + " months" : "no duration") + ")";
    }
}