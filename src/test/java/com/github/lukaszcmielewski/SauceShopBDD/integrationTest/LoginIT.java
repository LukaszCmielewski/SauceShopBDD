package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.page.InventoryPage;
import com.github.lukaszcmielewski.SauceShopBDD.page.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginIT extends Base {
    LoginPage loginPage;
    InventoryPage inventoryPage;

    private void gotoLoginPage() {
        loginPage = null;
        inventoryPage = null;
        loginPage = new LoginPage();
        loginPage.goTo("https://www.saucedemo.com/");
    }

    @Test
    public void loginStandardUserTest() {
        gotoLoginPage();
        inventoryPage = loginPage.insertLoginData("standard_user", "secret_sauce").clickLoginButton();
        Assertions.assertTrue(inventoryPage.cartLinkIsDisplayed());
    }
    @Test
    public void loginProblemUserTest() {
        gotoLoginPage();
        inventoryPage = loginPage.insertLoginData("problem_user", "secret_sauce").clickLoginButton();
        Assertions.assertTrue(inventoryPage.cartLinkIsDisplayed());
    }
    @Test
    public void loginVisualUserTest() {
        gotoLoginPage();
        inventoryPage = loginPage.insertLoginData("visual_user", "secret_sauce").clickLoginButton();
        Assertions.assertTrue(inventoryPage.cartLinkIsDisplayed());
    }
    @Test
    public void loginLockedUserTest() {
        gotoLoginPage();
        loginPage.insertLoginData("locked_out_user", "secret_sauce").clickLoginButton();
        Assertions.assertTrue(loginPage.errorLabelIsDisplayed());
    }
}
