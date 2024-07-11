package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {
    @FindBy(id = "react-burger-menu-btn")
    WebElement leftMenuButton;
    @FindBy(linkText = "All Items")
    WebElement allItemsMenu;
    @FindBy(linkText = "About")
    WebElement aboutMenu;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutMenu;
    @FindBy(id = "reset_sidebar_link")
    WebElement resetAppStateMenu;
    @FindBy(css = "div.app_logo")
    WebElement appLogo;
    @FindBy(css = "a.shopping_cart_link")
    WebElement cartLink;
    @FindBy(css = "span.title")
    WebElement titleText;
    @FindBy(linkText = "Twitter")
    WebElement twitterLink;
    @FindBy(linkText = "Facebook")
    WebElement facebookLink;
    @FindBy(linkText = "LinkedIn")
    WebElement linkedInLink;
    @FindBy(css = "div.footer_copy")
    WebElement footerCopy;

    public MenuPage() {

    }

    public boolean chceckLeftMenu() {
        leftMenuButton.click();
        Assertions.assertTrue(allItemsMenu.isDisplayed());
        Assertions.assertTrue(aboutMenu.isDisplayed());
        Assertions.assertTrue(logoutMenu.isDisplayed());
        Assertions.assertTrue(resetAppStateMenu.isDisplayed());
        return true;
    }

    public SauceLabsPage clickAboutMenu() {
        leftMenuButton.click();
        aboutMenu.click();
        return new SauceLabsPage();
    }

    public LoginPage clickLogoutLink() {
        leftMenuButton.click();
        logoutMenu.click();
        return new LoginPage();
    }

    public CartPage goToCart() {
        cartLink.click();
        return new CartPage();
    }

    public String returnPageTitle() {
        return titleText.getText();
    }

    public boolean checkMenuElements() {
        Assertions.assertTrue(footerCopy.isDisplayed());
        Assertions.assertTrue(linkedInLink.isDisplayed());
        Assertions.assertTrue(facebookLink.isDisplayed());
        Assertions.assertTrue(twitterLink.isDisplayed());
        Assertions.assertTrue(cartLink.isDisplayed());
        Assertions.assertTrue(leftMenuButton.isDisplayed());
        Assertions.assertTrue(appLogo.isDisplayed());
        Assertions.assertTrue(chceckLeftMenu());
        return true;
    }
}
