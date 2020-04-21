package com.thoughtworks.bootcamp.shoppingCart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCartTest {

    @Test
    void givenEmptyShoppingCart_whenAddOneApple_thenShouldReturnOneApplePrice() {
        Item itemOne = new Item("apple", 0.99, 1);
        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 0.99);

        ShoppingCart cart = new ShoppingCart();

        Assertions.assertEquals(map, cart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsTwo_thenShouldReturnPriceOnePointNineEight() {
        Item itemOne = new Item("apple", 0.99, 2);
        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 0.99);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsFive_thenShouldReturnPriceOnePointNineEight() {
        Item itemOne = new Item("apple", 0.99, 5);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 4.95);


        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenAddOneMaskItem_thenShouldReturnPriceOnePointNineNine() {
        Item itemOne = new Item("Mask", 1.99, 1);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 1.99);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenAddThreeMaskItem_thenShouldReturnPriceFivePointNineSeven() {
        Item itemOne = new Item("Mask", 1.99, 3);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 5.97);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenAddingOneMaskAndOneApple_thenShouldReturnTotalPriceOfTwoDifferentItemIsTwoPointNineEight() {

        Item itemOne = new Item("Apple", 0.99, 1);
        Item itemTwo = new Item("Mask", 1.99, 1);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);
        listOfItems.add(itemTwo);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 2.98);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));
    }

    @Test
    void givenShoppingCart_whenSellingOneMaskAndTwoAppleWith_thenShouldReturnTotalPriceOfTwoDifferentItemIsFourPointZeroFive() {

        Item itemOne = new Item("Apple", 0.99, 2);
        Item itemTwo = new Item("Mask", 1.99, 1);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);
        listOfItems.add(itemTwo);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 4.05);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));
    }

    @Test
    void givenShoppingCart_whenAddingThreeMaskAndThreeApple_thenShouldReturnTotalPriceOfTwoDifferentItemIsNinePointOneTwo() {

        Item itemOne = new Item("Apple", 0.99, 3);
        Item itemTwo = new Item("Mask", 1.99, 3);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);
        listOfItems.add(itemTwo);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 9.12);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));
    }

    @Test
    void givenShoppingCart_whenSellingThreeMaskAndThreeAppleWithTax_thenShouldReturnTotalPriceNinePointOneTwo() {

        Item itemOne = new Item("Apple", 0.99, 3);
        Item itemTwo = new Item("Mask", 1.99, 3);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);
        listOfItems.add(itemTwo);


        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 9.12);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));
    }

}
