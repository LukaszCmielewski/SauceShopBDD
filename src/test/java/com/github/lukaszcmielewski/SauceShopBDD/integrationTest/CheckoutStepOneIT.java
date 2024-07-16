package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.CheckoutStep1Tool;
import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.IMenu;
import com.github.lukaszcmielewski.SauceShopBDD.page.CheckoutPage;
import org.junit.jupiter.api.*;

import java.util.concurrent.ThreadLocalRandom;

public class CheckoutStepOneIT extends Base implements IMenu {
    public CheckoutPage page;
    int sizeOfCart;

    @BeforeEach
    public void init() {
        sizeOfCart = ThreadLocalRandom.current().nextInt(1, 6);
        page = CheckoutStep1Tool.goToCheckoutStepOnePage(sizeOfCart);
    }

    @Test
    public void continueWithoutInserFirstName() {
        page.continueClick("", "", "");
        Assertions.assertEquals(page.errorLabels.get(0), page.returnErrorLabel());
    }

    @Test
    public void continueWithoutInserLastName() {
        page.continueClick("aaa", "", "");
        Assertions.assertEquals(page.errorLabels.get(1), page.returnErrorLabel());
    }

    @Test
    public void continueWithoutInserPostalCode() {
        page.continueClick("aaa", "zzz", "");
        Assertions.assertEquals(page.errorLabels.get(2), page.returnErrorLabel());
    }
    @Test
    public void returnToCart(){
        Assertions.assertEquals("Your Cart",page.cancelCheckout().returnPageTitle());
    }
    @Test
    public void continueCheckout(){
        Assertions.assertEquals("Checkout: Overview",page.checkoutClick("fname", "lname", "22505").returnPageTitle());
    }

    //MenuTests
    @Test
    public void returnPageTitleIMenu() {
        Assertions.assertEquals("Checkout: Your Information", page.returnPageTitle());
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
