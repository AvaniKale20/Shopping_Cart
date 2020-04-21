package com.thoughtworks.bootcamp.shoppingCart;

import java.util.ArrayList;

public class ShoppingCart {

    public ShoppingCart() {

    }


    public Item add(ArrayList<Item> newItem) {
        double priceOfEachItem = 0;
        priceOfEachItem = priceOfEachItem + (newItem.getPrice() * newItem.getQuantity());
        priceOfEachItem = Math.round(priceOfEachItem * 100.0) / 100.0;
        return new Item(newItem.getItemName(), priceOfEachItem, newItem.getQuantity());
    }

}
