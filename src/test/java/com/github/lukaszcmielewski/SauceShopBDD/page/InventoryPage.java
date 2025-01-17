package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class InventoryPage extends MenuPage {
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement add2CartFleeceJacketButton;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement add2CartBackpackButton;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement add2CartBoltTShirtButton;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement add2CartTShirtRedButton;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement add2CartBikeLightButton;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement add2CartOnesieButton;
    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    WebElement removeFleeceJacketButton;
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeBackpackButton;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement removeBoltTShirtButton;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    WebElement removeTShirtRedButton;
    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement removeBikeLightButton;
    @FindBy(id = "remove-sauce-labs-onesie")
    WebElement removeOnesieButton;
    @FindBy(css = ".inventory_item button.btn_secondary")
    List<WebElement> listRemoveButtons;
    @FindBy(css = ".inventory_item button.btn_primary")
    List<WebElement> listAddtoCartButtons;
    @FindBy(css = "span.shopping_cart_badge")
    List<WebElement> cartSize;
    @FindBy(css = "a.shopping_cart_link")
    WebElement shoppingCartLink;
    @FindBy(css = "img.inventory_item_img")
    List<WebElement> imgList;

    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isRemoveFleeceJacketButton() {
        return removeFleeceJacketButton.isEnabled();
    }

    public boolean isRemoveBackpackButton() {
        return removeBackpackButton.isEnabled();
    }

    public boolean isRemoveBoltTShirtButton() {
        return removeBoltTShirtButton.isEnabled();
    }

    public boolean isRemoveTShirtRedButton() {
        return removeTShirtRedButton.isEnabled();
    }

    public boolean isRemoveBikeLightButton() {
        return removeBikeLightButton.isEnabled();
    }

    public boolean isRemoveOnesieButton() {
        return removeOnesieButton.isEnabled();
    }

    public boolean cartLinkIsDisplayed() {
        return cartLink.isDisplayed();
    }

    public InventoryPage addFleeceJacketToCart() {
        add2CartFleeceJacketButton.click();
        return this;
    }

    public InventoryPage addBackpackToCart() {
        add2CartBackpackButton.click();
        return this;
    }

    public InventoryPage addBoltTShirtToCart() {
        add2CartBoltTShirtButton.click();
        return this;
    }

    public InventoryPage addRedTShirtToCart() {
        add2CartTShirtRedButton.click();
        return this;
    }

    public InventoryPage addBikeLightToCart() {
        add2CartBikeLightButton.click();
        return this;
    }

    public InventoryPage addOnesieToCart() {
        add2CartOnesieButton.click();
        return this;
    }

    public CartPage goToCart() {
        shoppingCartLink.click();
        return new CartPage();
    }

    public InventoryPage goToInventoryPage() {
        driver.get("https://www.saucedemo.com/inventory.html");
        return this;
    }

    public int getCartSize() {
        if (cartSize.size() > 0) {
            return Integer.parseInt(cartSize.getFirst().getText());
        } else {
            return 0;
        }
    }

    public InventoryPage clickRandomProduct() {
        Random rand = new Random();
        listAddtoCartButtons.get(rand.nextInt(listAddtoCartButtons.size())).click();
        return this;
    }

    public InventoryPage addRandomProduckts(int sizeOfCart) {
        Random rand = new Random();
        int items = sizeOfCart;
        while (items > 0) {
            listAddtoCartButtons.get(rand.nextInt(listAddtoCartButtons.size())).click();
            items--;
        }
        return this;
    }

    public void clickRemoveButtons() {
        listRemoveButtons.forEach((btn) -> {
            btn.click();
        });
    }

    public boolean checkAllImageSrcIsCorrect() {
        String inCorrectScr = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";
        for (int i = 0; i < imgList.size(); i++) {
            if (imgList.get(i).getAttribute("src").equals(inCorrectScr)) {
                return false;
            }
        }
        return true;
    }
}
