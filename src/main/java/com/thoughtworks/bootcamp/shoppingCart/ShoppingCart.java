package com.thoughtworks.bootcamp.shoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart(ArrayList<Item> items) {
        this.items = items;
    }

    public double totalPrice(ArrayList<Item> item) {
        double totalPrice = 0;
        for (int i = 0; i < item.size(); i++) {
            totalPrice = totalPrice + (item.get(i).getPrice() * item.get(i).getQuantity());
        }
        return Math.round(totalPrice * 100.0) / 100.0;
    }

}
