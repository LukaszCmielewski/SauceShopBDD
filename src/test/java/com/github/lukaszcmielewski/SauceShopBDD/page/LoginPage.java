package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    WebElement userNameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login-button")
    WebElement loginButton;
    private WebDriver driver;
    @FindBy(css = "h3")
    WebElement errorLabel;
    @FindBy(css = "div.login_logo")
    WebElement loginLogo;

    public LoginPage() {

        //PageFactory.initElements(driver, this);
    }

    public LoginPage insertLoginData(String userName, String userPasswd) {
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(userPasswd);
        return this;
    }

    public InventoryPage clickLoginButton() {
        loginButton.click();
        return new InventoryPage();
    }

    public LoginPage failedLogin(String userName, String userPasswd) {
        loginButton.click();
        return this;
    }

    public LoginPage getLoginPage() {
        goTo("https://www.saucedemo.com/");
        return this;
    }

    public boolean errorLabelIsDisplayed(){
        return errorLabel.isDisplayed();
    }

    public boolean onLoginPage(){
        System.out.println(loginLogo.getText());
        System.out.println(loginLogo.getText().equals("Swag Labs"));
        return loginLogo.getText().equals("Swag Labs");
    }
}
