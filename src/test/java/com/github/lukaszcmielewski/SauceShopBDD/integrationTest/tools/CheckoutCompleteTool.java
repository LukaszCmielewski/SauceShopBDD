package com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools;

import com.github.lukaszcmielewski.SauceShopBDD.page.CheckoutCompletePage;

public class CheckoutCompleteTool {
    CheckoutCompletePage page;
    public CheckoutCompleteTool(){
        page=new CheckoutCompletePage();
    }

    public static CheckoutCompletePage goToCheckoutComplete(int sizeOfCart){
        return new CheckoutStep2Tool().goToCheckoutStepOnePage(sizeOfCart)
                                                                           .finishClick();
    }
}

