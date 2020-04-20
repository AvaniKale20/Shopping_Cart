package com.thoughtworks.bootcamp.shoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
    private String apple;
    private float price;
    private int quantity;

    public ShoppingCart(String apple, float price, int quantity) {
        this.apple = apple;
        this.price = price;
        this.quantity = quantity;
    }

    public float totalPrice(float price) {
        float totalPrice = price * getQuantity();
        return totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
