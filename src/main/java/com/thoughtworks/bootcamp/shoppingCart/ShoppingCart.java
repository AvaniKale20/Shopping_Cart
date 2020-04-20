package com.thoughtworks.bootcamp.shoppingCart;

public class ShoppingCart {
    private String apple;
    private double price;
    private int quantity;

    public ShoppingCart(String apple, double price, int quantity) {
        this.apple = apple;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalPrice(double price) {
        double totalPrice = price * getQuantity();
        return  totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
