package com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools;

import com.github.lukaszcmielewski.SauceShopBDD.page.CartPage;

public class CartTool {
    CartPage page;
    public CartTool(){
        page=new CartPage();
    }
    public static CartPage goToCart(int sizeOfCart){
        return new InventoryTool().goToInventory().addRandomProduckts(sizeOfCart).goToCart();
    }
}
