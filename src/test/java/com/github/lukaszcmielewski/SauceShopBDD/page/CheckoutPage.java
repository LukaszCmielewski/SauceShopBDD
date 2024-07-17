package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CheckoutPage extends MenuPage {
    public static List<String> errorLabels;
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
    @FindBy(css = "svg.error_icon")
    List<WebElement> errorIconList;
    @FindBy(tagName = "h3")
    WebElement errorLabel;

    public CheckoutPage() {
        super();
        errorLabels = new ArrayList<>();
        errorLabels.add("Error: First Name is required");
        errorLabels.add("Error: Last Name is required");
        errorLabels.add("Error: Postal Code is required");
    }

    public CheckoutStepTwoPage checkoutClick(String fname, String lname, String postalCode) {
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        postalCodeInput.sendKeys(postalCode);
        continueButton.click();
        return new CheckoutStepTwoPage();
    }

    public void continueClick(String fname, String lname, String postalCode) {
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        postalCodeInput.sendKeys(postalCode);
        continueButton.click();
    }

    public CartPage cancelCheckout() {
        cancelButton.click();
        return new CartPage();
    }

    public int returnSizeErrorIconList() {
        return errorIconList.size();
    }

    public String returnErrorLabel() {
        return errorLabel.getText();
    }
}
