package com.github.lukaszcmielewski.SauceShopBDD.step;

import com.github.lukaszcmielewski.SauceShopBDD.page.InventoryPage;
import com.github.lukaszcmielewski.SauceShopBDD.page.LoginPage;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

public class InventoryStepdefs {
    LoginPage loginPage;
    InventoryPage inventoryPage;
    String passwd="secret_sauce";
    public InventoryStepdefs() {
        loginPage = new LoginPage();

    }

    @Given("User is on SauceShopDemo and enter {string} and Password and clock loginButton")
    public void goToInventoryPage(String userLogin) {
        loginPage = new LoginPage();
        inventoryPage= loginPage.getLoginPage().insertLoginData(userLogin,passwd).clickLoginButton();
    }
    @When("User is in InvetoryPage")
    public void checkIfUserIsOnInventoryPage() {
        Assertions.assertTrue(inventoryPage.checkMenuElements());
    }

    @And("Check image and expecting {string}")
    public void checkImageAndExpecting(String arg0) {
        boolean expectingResult=arg0.equals("true");
        System.out.println(expectingResult);

        Assertions.assertEquals(expectingResult,inventoryPage.checkAllImageSrcIsCorrect());
    }
}
