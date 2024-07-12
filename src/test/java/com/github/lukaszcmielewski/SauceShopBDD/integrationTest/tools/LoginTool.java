package com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools;

import com.github.lukaszcmielewski.SauceShopBDD.page.InventoryPage;
import com.github.lukaszcmielewski.SauceShopBDD.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTool {


    public InventoryPage login(String name, String pass) {
        return new LoginPage().getLoginPage().insertLoginData(name, pass).clickLoginButton();
    }
}
