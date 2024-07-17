package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends MenuPage {
    @FindBy(id = "back-to-products")
    WebElement backHomeButton; //back to Inventory
    @FindBy(css = "h2.complete-header")
    WebElement completeHeaderLabel;
    @FindBy(css = "div.complete-text")
    WebElement completeTextLabel;
    @FindBy(css = "img.pony_express")
    WebElement OkImg;

    public CheckoutCompletePage() {
        super();
    }

    public InventoryPage backHome() {
        backHomeButton.click();
        return new InventoryPage();
    }
    public String returnCompleteHeader(){
        return completeHeaderLabel.getText();
    }
    public String returnCompleteText(){
        return completeTextLabel.getText();
    }
    public boolean checkDisplayedElements(){
        return (backHomeButton.isDisplayed()&&
                completeHeaderLabel.isDisplayed()&&
                completeTextLabel.isDisplayed()&&
                OkImg.isDisplayed());
    }
}
