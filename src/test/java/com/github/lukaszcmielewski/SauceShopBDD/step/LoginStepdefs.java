package com.github.lukaszcmielewski.SauceShopBDD.step;

import com.github.lukaszcmielewski.SauceShopBDD.page.InventoryPage;
import com.github.lukaszcmielewski.SauceShopBDD.page.LoginPage;
import com.github.lukaszcmielewski.SauceShopBDD.util.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginStepdefs {

    LoginPage loginPage;
    InventoryPage inventoryPage;

    public LoginStepdefs() {
        //driver = DriverFactory.getBrowser();
        loginPage = new LoginPage();
    }

    @Given("User is on SauceShopDemo")
    public void userIsOnSauceShopDemo() {
        loginPage = new LoginPage();
        loginPage.getLoginPage();
    }

    @And("Insert login data")
    public void insertLoginData() {
        loginPage.insertLoginData("standard_user", "secret_sauce");
    }

    @When("Click loginButton")
    public void clickLoginButton() {
        inventoryPage = loginPage.clickLoginButton();
    }

    @Then("user is on InventoryPage")
    public void userIsOnInventoryPage() {
        Assertions.assertTrue(inventoryPage.cartLinkIsDisplayed());
    }

    @And("Close browser")
    public void closeBroswer() {
        DriverFactory.quitDriver();
    }

    @And("When I enter Username as {string} and Password")
    public void whenIEnterUsernameAsAndPassword(String arg0) {
        loginPage.insertLoginData(arg0, "secret_sauce");
    }

    @And("When I enter locked_out_user and password")
    public void whenIEneterLocked_out_userAndPassword() {
        loginPage.insertLoginData("locked_out_user", "secret_sauce");
    }

    @When("Click login button")
    public void clickLoginButtonFailed() {
        loginPage.failedLogin();
    }

    @And("When I enter {string} and {string}")
    public void whenIEnterAnd(String loginProblem, String password) {
        loginPage.insertLoginData(loginProblem, password);
    }

    @Then("Check messege {string}")
    public void checkMessege(String errorMessage) {
        Assertions.assertEquals(errorMessage,loginPage.getErrorMessage());
    }
}

