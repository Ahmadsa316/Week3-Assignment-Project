package org.example.week3_assignment.model;

import java.util.List;

public class CartRecord {
    private int id;
    private int totalItems;
    private double totalCost;
    private String language;
    private List<CartItem> items;

    public CartRecord(int totalItems, double totalCost, String language, List<CartItem> items) {
        this.totalItems = totalItems;
        this.totalCost = totalCost;
        this.language = language;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }
}