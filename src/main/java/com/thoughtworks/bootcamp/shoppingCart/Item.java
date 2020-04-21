package com.thoughtworks.bootcamp.shoppingCart;

public class Item {
    private String itemName;
    private double price;
    private double quantity;

    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
