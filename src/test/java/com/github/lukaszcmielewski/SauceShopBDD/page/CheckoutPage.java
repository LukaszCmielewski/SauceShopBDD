package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends MenuPage {
    @FindBy(id = "continue")
    WebElement continueButton;
    @FindBy(id = "cancel")
    WebElement cancelButton;
    @FindBy(id = "first-name")
    WebElement firstNameInput;
    @FindBy(id = "last-name")
    WebElement lastNameInput;
    @FindBy(id = "postal-code")
    WebElement postalCodeInput;

    public CheckoutPage() {
        super();
    }

    public CheckoutStepTwoPage checkoutClick(String fname, String lname, String postalCode) {
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        postalCodeInput.sendKeys(postalCode);
        continueButton.click();
        return new CheckoutStepTwoPage();
    }

    public CartPage cancelCheckout() {
        cancelButton.click();
        return new CartPage();
    }
}
