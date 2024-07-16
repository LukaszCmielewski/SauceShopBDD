package com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools;

import com.github.lukaszcmielewski.SauceShopBDD.page.CheckoutPage;

import java.util.List;

public class CheckoutStep1Tool {
    public static List<String> errorLabels;
    CheckoutPage page;

    public CheckoutStep1Tool() {
        page = new CheckoutPage();
    }

    public static CheckoutPage goToCheckoutStepOnePage(int sizeOfCart) {
        return new CartTool().goToCart(sizeOfCart).goToCheckout();
    }
}
