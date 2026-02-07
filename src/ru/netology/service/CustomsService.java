package ru.netology.service;

public class CustomsService {
    public static final int CUSTOM_WEIGHT = 100;

    public static int calculateCustoms(int price, int weight) {
        int customsPrice = price / 100;
        int customsPriceWeight = weight * CustomsService.CUSTOM_WEIGHT;
        return customsPriceWeight + customsPrice;
    }
}
