package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.*;
import com.github.lukaszcmielewski.SauceShopBDD.page.CheckoutStepTwoPage;
import org.junit.jupiter.api.*;

import java.util.concurrent.ThreadLocalRandom;

public class CheckoutStepTwoIT extends Base implements IMenu {
    public CheckoutStepTwoPage page;
    int sizeOfCart;

    @BeforeEach
    public void init() {
        sizeOfCart = ThreadLocalRandom.current().nextInt(1, 6);
        page = CheckoutStep2Tool.goToCheckoutStepOnePage(sizeOfCart);
    }

    @Test
    public void checkCartSize(){
        Assertions.assertEquals(sizeOfCart,page.getSizeOfProducts());
    }
    @Test
    public void chechAmountOfPrice(){
        Assertions.assertEquals(sizeOfCart,page.getAmountOfPrices());
    }

    @Test
    public void checkDisplayedPageElements(){
        Assertions.assertTrue(page.checkDisplayedWebElements());
    }












    //MenuTests
    @Test
    public void returnPageTitleIMenu() {
        Assertions.assertEquals("Checkout: Overview", page.returnPageTitle());
    }

    @Test
    public void clickAboutMenuIMenu() {
        Assertions.assertTrue(page.clickAboutMenu().getCareersTestLink().equals("Careers"));
    }

    @Test
    public void clickLogoutLinkIMenu() {
        Assertions.assertTrue(page.clickLogoutLink().onLoginPage());
    }

    @Test
    public void goToCartIMenu() {
        Assertions.assertTrue(page.goToCart().checkCartElements());
    }

    @Test
    public void checkMenuElementsIMenu() {
        Assertions.assertTrue(page.checkMenuElements());
    }
}
