package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.LoginTool;
import com.github.lukaszcmielewski.SauceShopBDD.page.InventoryPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class InventoryIT extends Base{
    public InventoryPage inventoryPage;
    @Test
    public void addProductToCart(){
        inventoryPage= new LoginTool().login("standard_user","secret_sauce");
        inventoryPage.addBackpackToCart();
        Assertions.assertTrue(inventoryPage.getCartSize()==1);
    }
}
