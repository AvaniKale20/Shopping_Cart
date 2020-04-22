package com.thoughtworks.bootcamp.shoppingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    public ShoppingCart() {

    }


    double priceOfItem = 0;
    List<Item> shoppingCartTotalPriceList = new ArrayList<>();
    double totalPriceOfAllItem = 0;
    Map<List<Item>, Double> map = new HashMap<>();
    double totalPriceWithInterest = 0;


    public Map<List<Item>, Double> add(ArrayList<Item> newItemList) {
        for (int i = 0; i < newItemList.size(); i++) {
            double priceOfEachItem = 0;
            priceOfEachItem = priceOfEachItem + (newItemList.get(i).getPrice() * newItemList.get(i).getQuantity());
            priceOfItem = Math.round(priceOfEachItem * 100.0) / 100.0;

            shoppingCartTotalPriceList.add(new Item(newItemList.get(i).getItemName(), newItemList.get(i).getPrice(), newItemList.get(i).getQuantity()));

            totalPriceOfAllItem = Math.round((totalPriceOfAllItem + priceOfItem) * 100.0) / 100.0;
            double tax = salesTax();
            totalPriceWithInterest = totalPriceOfAllItem + tax;
        }
        map.put(shoppingCartTotalPriceList, totalPriceWithInterest);
        return map;
    }

    double salesTax() {
        double result = 0;
        result = (totalPriceOfAllItem * 2) / 100;
        return Math.round(result * 100.0) / 100.0;
    }

    public Item addWithSpecialOffer(ArrayList<Item> listOfItems) {
    }
}
