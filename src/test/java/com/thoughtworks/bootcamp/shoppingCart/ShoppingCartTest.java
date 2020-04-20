package com.thoughtworks.bootcamp.shoppingCart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ShoppingCartTest {

    @Test
    void givenEmptyShoppingCart_whenAddOneApple_thenShouldReturnOneApplePrice() {
        ShoppingCart cart = new ShoppingCart("apple", 0.99, 1);
        double oneApplePrice = 0.99;

        Assertions.assertEquals(0.99, cart.totalPrice(oneApplePrice));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsTwo_thenShouldReturnPriceOnePointNineEight() {

        ShoppingCart shoppingCart = new ShoppingCart("apple", 0.99, 2);

        double applePrice = 0.99;
        Assertions.assertEquals(1.98, shoppingCart.totalPrice(applePrice));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsFive_thenShouldReturnPriceFourPointNineFive() {

        ShoppingCart shoppingCart = new ShoppingCart("apple", 0.99, 5);

        double applePrice = 0.99;
        Assertions.assertEquals( 4.95, shoppingCart.totalPrice(applePrice));

    }

}
