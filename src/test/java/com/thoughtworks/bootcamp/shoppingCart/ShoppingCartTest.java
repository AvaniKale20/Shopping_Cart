package com.thoughtworks.bootcamp.shoppingCart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ShoppingCartTest {

    @Test
    void givenEmptyShoppingCart_whenAddOneApple_thenShouldReturnOneApplePrice() {
        Item item = new Item("apple", 0.99, 1);
        ShoppingCart cart = new ShoppingCart(item);
        double oneApplePrice = 0.99;

        Assertions.assertEquals(0.99, cart.totalPrice(oneApplePrice));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsTwo_thenShouldReturnPriceOnePointNineEight() {
        Item item = new Item("apple", 0.99, 2);
        ShoppingCart shoppingCart = new ShoppingCart(item);

        double applePrice = 0.99;
        Assertions.assertEquals(1.98, shoppingCart.totalPrice(applePrice));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsFive_thenShouldReturnPriceFourPointNineFive() {

        Item item = new Item("apple", 0.99, 5);
        ShoppingCart shoppingCart = new ShoppingCart(item);

        double applePrice = 0.99;
        Assertions.assertEquals(4.95, shoppingCart.totalPrice(applePrice));

    }

    @Test
    void givenShoppingCart_whenAddedOneSecondItem_thenShouldReturnOneQuantityOfThatItem() {

        Item item = new Item("Mask", 1.99, 1);

        Assertions.assertEquals(1, item.getQuantity());

    }

    @Test
    void givenShoppingCart_whenAddedOneSecondItem_thenShouldReturnPriceOnePointNineNine() {

        Item item = new Item("Mask", 1.99, 1);

        Assertions.assertEquals(1.99, item.getPrice());

    }

    @Test
    void givenShoppingCart_whenMaskQuantityIsTwo_thenShouldReturnPriceThreePointNineEight() {

        Item item = new Item("Mask", 1.99, 2);
        ShoppingCart cart = new ShoppingCart(item);

        Assertions.assertEquals(3.98, cart.totalPrice(1.99));

    }
}
