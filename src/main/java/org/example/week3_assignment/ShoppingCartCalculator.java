package org.example.week3_assignment;

public class ShoppingCartCalculator {

    public static double calculateItemCost(double price, int quantity) {
        return price * quantity;
    }

    public static double addToTotal(double currentTotal, double itemCost) {
        return currentTotal + itemCost;
    }
}