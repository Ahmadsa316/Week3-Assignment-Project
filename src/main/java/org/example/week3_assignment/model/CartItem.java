package org.example.week3_assignment.model;

public class CartItem {
    private int itemNumber;
    private double price;
    private int quantity;
    private double subtotal;

    public CartItem(int itemNumber, double price, int quantity) {
        this.itemNumber = itemNumber;
        this.price = price;
        this.quantity = quantity;
        this.subtotal = price * quantity;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.subtotal = this.price * this.quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.subtotal = this.price * this.quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }
}