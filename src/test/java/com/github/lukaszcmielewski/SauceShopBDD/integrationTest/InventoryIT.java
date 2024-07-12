package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.InventoryTool;
import com.github.lukaszcmielewski.SauceShopBDD.page.InventoryPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryIT extends Base {
    public InventoryPage inventoryPage;

    @Test
    public void addBackPackToCartTest() {
        inventoryPage = InventoryTool.goToInventory().addBackpackToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveBackpackButton());
    }

    @Test
    public void addFleeceJacketToCartTest() {
        inventoryPage = InventoryTool.goToInventory().addFleeceJacketToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveFleeceJacketButton());
    }

    @Test
    public void addBoltTShirtToCartTest() {
        inventoryPage = InventoryTool.goToInventory().addBoltTShirtToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveBoltTShirtButton());
    }

    @Test
    public void addRedTShirtToCartTest() {
        inventoryPage = InventoryTool.goToInventory().addRedTShirtToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveTShirtRedButton());
    }

    @Test
    public void addBikeLightToCartTest() {
        inventoryPage = InventoryTool.goToInventory().addBikeLightToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveBikeLightButton());
    }

    @Test
    public void addOnesieToCartTest() {
        inventoryPage = InventoryTool.goToInventory().addOnesieToCart();
        Assertions.assertTrue(inventoryPage.getCartSize() == 1);
        Assertions.assertTrue(inventoryPage.isRemoveOnesieButton());
    }
}
