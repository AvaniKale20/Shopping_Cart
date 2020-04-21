package com.thoughtworks.bootcamp.shoppingCart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class ShoppingCartTest {

    @Test
    void givenEmptyShoppingCart_whenAddOneApple_thenShouldReturnOneApplePrice() {
        Item itemOne = new Item("apple", 0.99, 1);
        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);
        ShoppingCart cart = new ShoppingCart(listOfItems);

        Assertions.assertEquals(0.99, cart.totalPrice(listOfItems));

    }
}
