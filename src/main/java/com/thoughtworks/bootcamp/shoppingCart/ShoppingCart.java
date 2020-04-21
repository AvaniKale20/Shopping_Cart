package com.thoughtworks.bootcamp.shoppingCart;

public class ShoppingCart {

    public ShoppingCart() {

    }


    public Item totalPrice(Item newItem) {
        double priceOfEachItem = 0;
        priceOfEachItem = priceOfEachItem + (newItem.getPrice() * newItem.getQuantity());
        priceOfEachItem = Math.round(priceOfEachItem * 100.0) / 100.0;
        return new Item(newItem.getItemName(), priceOfEachItem, newItem.getQuantity());
    }

}
