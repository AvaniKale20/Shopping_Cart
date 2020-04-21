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

        Assertions.assertEquals(0.99, cart.totalPrice());

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsTwo_thenShouldReturnPriceOnePointNineEight() {
        Item itemOne = new Item("apple", 0.99, 2);
        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        ShoppingCart shoppingCart = new ShoppingCart(listOfItems);

        double applePrice = 0.99;
        Assertions.assertEquals(1.98, shoppingCart.totalPrice());

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsFive_thenShouldReturnPriceFourPointNineFive() {

        Item itemOne = new Item("apple", 0.99, 5);
        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        ShoppingCart shoppingCart = new ShoppingCart(listOfItems);

        Assertions.assertEquals(4.95, shoppingCart.totalPrice());

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

        Item itemOne = new Item("Mask", 1.99, 2);
        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        ShoppingCart cart = new ShoppingCart(listOfItems);

        Assertions.assertEquals(3.98, cart.totalPrice());

    }

    @Test
    void givenShoppingCart_whenSellingOneMaskAndOneApple_thenShouldReturnTotalPriceOfTwoDifferentItemIsTwoPointNineEight() {

        Item itemOne = new Item("Apple", 0.99, 1);
        Item itemTwo = new Item("Mask", 1.99, 1);
        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);
        listOfItems.add(itemTwo);


        ShoppingCart cart = new ShoppingCart(listOfItems);

        Assertions.assertEquals(2.98, cart.totalPrice());

    }
}
