package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends MenuPage {
    @FindBy(id = "continue-shopping")
    WebElement continueShopingButton;
    @FindBy(id = "checkout")
    WebElement checkoutButton;
    @FindBy(css = "div.inventory_item_name")
    List<WebElement> listProductLabels;
    @FindBy(css = "div.inventory_item_price")
    List<WebElement> listPriceProductLabels;
    @FindBy(css = "button.btn_secondary.btn_small")
    List<WebElement> listRemoveButtons;

    public CartPage() {
        super();
    }

    public InventoryPage continueShopping() {
        continueShopingButton.click();
        return new InventoryPage();
    }

    public CheckoutPage goToCheckout() {
        checkoutButton.click();
        return new CheckoutPage();
    }

    public int getSizeOfCart() {
        return listPriceProductLabels.size();
    }

    public CartPage clickAllRemoveButton() {
        listRemoveButtons.forEach((btn) -> {
            btn.click();
        });
        return this;
    }

    public boolean checkCartElements() {
        Assertions.assertTrue(continueShopingButton.isDisplayed());
        Assertions.assertTrue(checkoutButton.isDisplayed());
        Assertions.assertEquals(returnPageTitle(), "Your Cart");
        return true;
    }
}
