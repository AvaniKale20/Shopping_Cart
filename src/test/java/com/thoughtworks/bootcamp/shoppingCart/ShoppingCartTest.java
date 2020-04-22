package com.thoughtworks.bootcamp.shoppingCart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCartTest {

    @Test
    void givenEmptyShoppingCart_whenAddOneAppleWithTax_thenShouldReturnOnePointOne() {
        Item itemOne = new Item("apple", 0.99, 1);
        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 1.01);

        ShoppingCart cart = new ShoppingCart();

        Assertions.assertEquals(map, cart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsTwo_thenShouldReturnPriceTwoPointZeroTwo() {
        Item itemOne = new Item("apple", 0.99, 2);
        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 2.02);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenAppleQuantityIsFiveWithTax_thenShouldReturnPriceFivePointZeroFive() {
        Item itemOne = new Item("apple", 0.99, 5);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 5.05);


        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenAddOneMaskItemWithTax_thenShouldReturnPriceTwoPointZeroThree() {
        Item itemOne = new Item("Mask", 1.99, 1);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 2.03);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenAddThreeMaskItemWithTax_thenShouldReturnPriceSixPointZeroNine() {
        Item itemOne = new Item("Mask", 1.99, 3);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 6.09);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(map, shoppingCart.add(listOfItems));

    }

    @Test
    void givenShoppingCart_whenSellingOneMaskAndOneAppleWithTax_thenShouldReturnTotalPriceOfTwoDifferentItemIsThreePointZeroFour() {

        Item itemOne = new Item("Apple", 0.99, 1);
        Item itemTwo = new Item("Mask", 1.99, 1);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(itemOne);
        listOfItems.add(itemTwo);

        Map<List<Item>, Double> map = new HashMap<>();
        map.put(listOfItems, 3.04);

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

    @Test
    void givenShoppingCart_whenSellingTwoAppleWithOfferBuyTwoGetThreeFree_thenShouldReturnObjectWithFiveQuantity() {
        Item apple = new Item("Apple", 0.99, 2);
        Item freeApple = new Item("Apple", 0.99, 3);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.add(apple);
        listOfItems.add(freeApple);

        ShoppingCart shoppingCart = new ShoppingCart();

        Assertions.assertEquals(new Item("Apple", 0.99, 5), shoppingCart.addWithSpecialOffer(listOfItems));
    }
}
