package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutStepTwoPage extends MenuPage {
    @FindBy(id = "finish")
    WebElement finishButton;
    @FindBy(id = "cancel")
    WebElement cancelButton;
    @FindBy(css = "div.summary_total_label")
    WebElement totalPriceLabel;
    @FindBy(css = "div.summary_tax_label")
    WebElement totalTaxLabel;
    @FindBy(css = "div.inventory_item_name")
    List<WebElement> listProductLabels;
    @FindBy(css = "div.inventory_item_price")
    List<WebElement> listPriceProductLabels;

    public CheckoutStepTwoPage() {
        super();
    }

    public int getAmountOfPrices() {
        return listPriceProductLabels.size();
    }

    public CheckoutPage goToCheckoutStepOnePage(int sizeOfCart) {
        cancelButton.click();
        return new CheckoutPage();
    }

    public int getSizeOfProducts() {
        return listProductLabels.size();
    }

    public CheckoutCompletePage finishClick() {
        finishButton.click();
        return new CheckoutCompletePage();
    }

    public boolean checkDisplayedWebElements() {
        return (finishButton.isDisplayed()
                && cancelButton.isDisplayed()
                && totalPriceLabel.isDisplayed()
                && totalTaxLabel.isDisplayed());
    }
}