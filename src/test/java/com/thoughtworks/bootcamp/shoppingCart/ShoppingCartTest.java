package com.thoughtworks.bootcamp.shoppingCart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    void givenEmptyShoppingCart_whenAddOneApple_thenShouldReturnOneApplePrice() {
        Item itemOne = new Item("apple", 0.99, 1);

        ShoppingCart cart = new ShoppingCart();

        Assertions.assertEquals(new Item("apple", 0.99, 1), cart.totalPrice(itemOne));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsTwo_thenShouldReturnPriceOnePointNineEight() {
        Item itemOne = new Item("apple", 0.99, 2);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(new Item("apple", 1.98, 2), shoppingCart.totalPrice(itemOne));

    }
}
