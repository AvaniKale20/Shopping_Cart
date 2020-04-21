package com.thoughtworks.bootcamp.shoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart(ArrayList<Item> items) {
        this.items = items;
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < items.size(); i++) {
            totalPrice = totalPrice + (items.get(i).getPrice() * items.get(i).getQuantity());
        }
        return  Math.round(totalPrice*100.0)/100.0;

    }
}
