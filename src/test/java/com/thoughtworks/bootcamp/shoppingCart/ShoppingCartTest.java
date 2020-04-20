package com.thoughtworks.bootcamp.shoppingCart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    void givenEmptyShoppingCart_whenAddOneApple_thenShouldReturnOneApplePrice() {
        ShoppingCart cart = new ShoppingCart("apple", (float) 0.99);
        float oneApplePrice = (float) 0.99;

        Assertions.assertEquals((float) 0.99, cart.totalPrice(oneApplePrice));

    }


}
