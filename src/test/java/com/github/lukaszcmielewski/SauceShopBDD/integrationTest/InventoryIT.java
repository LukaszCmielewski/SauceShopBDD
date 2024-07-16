package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.IMenu;
import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.InventoryTool;
import com.github.lukaszcmielewski.SauceShopBDD.page.InventoryPage;
import org.junit.jupiter.api.*;

public class InventoryIT extends Base implements IMenu {
    public InventoryPage page;

    @BeforeEach
    public void init() {
        page = InventoryTool.goToInventory();
    }

    @Test
    public void addBackPackToCartTest() {
        page.addBackpackToCart();
        Assertions.assertTrue(page.getCartSize() == 1);
        Assertions.assertTrue(page.isRemoveBackpackButton());
    }

    @Test
    public void addFleeceJacketToCartTest() {
        page.addFleeceJacketToCart();
        Assertions.assertTrue(page.getCartSize() == 1);
        Assertions.assertTrue(page.isRemoveFleeceJacketButton());
    }

    @Test
    public void addBoltTShirtToCartTest() {
        page.addBoltTShirtToCart();
        Assertions.assertTrue(page.getCartSize() == 1);
        Assertions.assertTrue(page.isRemoveBoltTShirtButton());
    }

    @Test
    public void addRedTShirtToCartTest() {
        page.addRedTShirtToCart();
        Assertions.assertTrue(page.getCartSize() == 1);
        Assertions.assertTrue(page.isRemoveTShirtRedButton());
    }

    @Test
    public void addBikeLightToCartTest() {
        page.addBikeLightToCart();
        Assertions.assertTrue(page.getCartSize() == 1);
        Assertions.assertTrue(page.isRemoveBikeLightButton());
    }

    @Test
    public void addOnesieToCartTest() {
        page.addOnesieToCart();
        Assertions.assertTrue(page.getCartSize() == 1);
        Assertions.assertTrue(page.isRemoveOnesieButton());
    }
    //MenuTests
    @Test
    public void returnPageTitleIMenu() {
        Assertions.assertEquals("Products", page.returnPageTitle());
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
