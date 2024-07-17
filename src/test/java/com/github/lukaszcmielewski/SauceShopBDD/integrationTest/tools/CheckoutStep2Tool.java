package com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools;

import com.github.lukaszcmielewski.SauceShopBDD.page.CheckoutPage;
import com.github.lukaszcmielewski.SauceShopBDD.page.CheckoutStepTwoPage;

public class CheckoutStep2Tool {
    CheckoutStepTwoPage page;
    public CheckoutStep2Tool() {
        page = new CheckoutStepTwoPage();
    }

    public static CheckoutStepTwoPage goToCheckoutStepOnePage(int sizeOfCart) {
        return new CheckoutStep1Tool().goToCheckoutStepOnePage(sizeOfCart).checkoutClick("CheckoutStepTwoPage", "CheckoutStepTwoPage", "22505");
    }
}
