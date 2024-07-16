package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.*;
import com.github.lukaszcmielewski.SauceShopBDD.page.CartPage;
import org.junit.jupiter.api.*;

import java.util.concurrent.ThreadLocalRandom;

public class CartIT extends Base implements IMenu {
    public CartPage page;
    int sizeOfCart;
    @BeforeEach
    public void init() {
        sizeOfCart=ThreadLocalRandom.current().nextInt(1, 6);
        page = CartTool.goToCart(sizeOfCart);
    }
    @Test
    public void chechCartSize(){
        Assertions.assertEquals(sizeOfCart,page.getSizeOfCart());
    }
    @Test
    public void continueShopping(){
        Assertions.assertEquals("Products",page.continueShopping().returnPageTitle());
    }
    @Test
    public void  goToCheckoutStepOne(){
        Assertions.assertEquals("Checkout: Your Information",page.goToCheckout().returnPageTitle());
    }




    //MenuTests
    @Test
    public void returnPageTitleIMenu() {
        Assertions.assertEquals("Your Cart", page.returnPageTitle());
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
