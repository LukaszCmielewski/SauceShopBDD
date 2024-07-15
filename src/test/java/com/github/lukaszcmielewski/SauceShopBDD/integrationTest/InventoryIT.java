package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.IMenu;
import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.InventoryTool;
import com.github.lukaszcmielewski.SauceShopBDD.page.InventoryPage;
import org.junit.jupiter.api.*;

public class InventoryIT extends Base implements IMenu {
    public InventoryPage inventoryPage;

    @BeforeEach
    public void init() {
        inventoryPage = InventoryTool.goToInventory();
    }

    @Test
    public void addBackPackToCartTest() {
        inventoryPage.addBackpackToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveBackpackButton());
    }

    @Test
    public void addFleeceJacketToCartTest() {
        inventoryPage.addFleeceJacketToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveFleeceJacketButton());
    }

    @Test
    public void addBoltTShirtToCartTest() {
        inventoryPage.addBoltTShirtToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveBoltTShirtButton());
    }

    @Test
    public void addRedTShirtToCartTest() {
        inventoryPage.addRedTShirtToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveTShirtRedButton());
    }

    @Test
    public void addBikeLightToCartTest() {
        inventoryPage.addBikeLightToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveBikeLightButton());
    }

    @Test
    public void addOnesieToCartTest() {
        inventoryPage.addOnesieToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveOnesieButton());
    }

    @Test
    @Override
    public void clickAboutMenu() {
        Assertions.assertTrue(inventoryPage.clickAboutMenu().getCareersTestLink().equals("Careers"));
    }

    @Test
    @Override
    public void clickLogoutLink() {
        Assertions.assertTrue(inventoryPage.clickLogoutLink().onLoginPage());
    }

    @Test
    @Override
    public void goToCart() {
        Assertions.assertTrue(inventoryPage.goToCart().checkCartElements());
    }

    @Test
    @Override
    public void returnPageTitle() {
        Assertions.assertEquals("Products", inventoryPage.returnTitle());
    }

    @Test
    @Override
    public void checkMenuElements() {
        Assertions.assertTrue(inventoryPage.checkMenuElements());
    }
}
