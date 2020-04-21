package com.thoughtworks.bootcamp.shoppingCart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    void givenEmptyShoppingCart_whenAddOneApple_thenShouldReturnOneApplePrice() {
        Item itemOne = new Item("apple", 0.99, 1);

        ShoppingCart cart = new ShoppingCart();

        Assertions.assertEquals(new Item("apple", 0.99, 1), cart.add(itemOne));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsTwo_thenShouldReturnPriceOnePointNineEight() {
        Item itemOne = new Item("apple", 0.99, 2);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(new Item("apple", 1.98, 2), shoppingCart.add(itemOne));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsFive_thenShouldReturnPriceOnePointNineEight() {
        Item itemOne = new Item("apple", 0.99, 5);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(new Item("apple", 4.95, 5), shoppingCart.add(itemOne));

    }

    @Test
    void givenShoppingCart_whenAddOneMaskItem_thenShouldReturnPriceOnePointNineNine() {
        Item itemOne = new Item("Mask", 1.99, 1);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(new Item("Mask", 1.99, 1), shoppingCart.add(itemOne));

    }
    @Test
    void givenShoppingCart_whenAddThreeMaskItem_thenShouldReturnPriceFivePointNineSeven() {
        Item itemOne = new Item("Mask", 1.99, 3);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(new Item("Mask", 5.97, 3), shoppingCart.add(itemOne));

    }
}
