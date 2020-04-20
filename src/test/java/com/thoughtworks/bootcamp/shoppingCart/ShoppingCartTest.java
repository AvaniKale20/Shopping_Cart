package com.thoughtworks.bootcamp.shoppingCart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ShoppingCartTest {

    @Test
    void givenEmptyShoppingCart_whenAddOneApple_thenShouldReturnOneApplePrice() {
        ShoppingCart cart = new ShoppingCart("apple", (float) 0.99, 1);
        float oneApplePrice = (float) 0.99;

        Assertions.assertEquals((float) 0.99, cart.totalPrice(oneApplePrice));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsTwo_thenShouldReturnPriceOnePointNineEight() {

        ShoppingCart shoppingCart = new ShoppingCart("apple", (float) 0.99, 2);

        float applePrice = (float) 0.99;
        Assertions.assertEquals((float)1.98, shoppingCart.totalPrice(applePrice));

    }

}
