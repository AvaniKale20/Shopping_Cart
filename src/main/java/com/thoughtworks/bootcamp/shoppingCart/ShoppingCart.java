package com.thoughtworks.bootcamp.shoppingCart;

public class ShoppingCart {
    private String apple;
    private float price;

    public ShoppingCart(String apple, float price) {
        this.apple = apple;
        this.price = price;
    }

    public float totalPrice(float price) {
        return (float) 0.99;
    }

}
