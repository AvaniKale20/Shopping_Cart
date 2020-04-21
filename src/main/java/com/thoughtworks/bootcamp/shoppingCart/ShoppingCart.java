package com.thoughtworks.bootcamp.shoppingCart;

public class ShoppingCart {
    private Item items;

    public ShoppingCart(Item items) {
        this.items = items;
    }

    public double totalPrice(double price) {
        double totalPrice = price * items.getQuantity();
        return totalPrice;
    }
}
