package com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools;

import com.github.lukaszcmielewski.SauceShopBDD.page.InventoryPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryTool {
    InventoryPage inventoryPage;

    public InventoryTool() {
        inventoryPage = new InventoryPage();
    }

    public InventoryTool(InventoryPage ip) {
        inventoryPage = ip;
    }

    public static InventoryPage goToInventory() {
        return new LoginTool().login("standard_user", "secret_sauce");
    }

    public InventoryPage goToInventory(String name, String pass) {
        return new LoginTool().login(name, pass);
    }

    public InventoryPage addBackPack() {
        return inventoryPage.addBackpackToCart();
    }

    public InventoryPage addFleeceJacket() {
        return inventoryPage.addFleeceJacketToCart();
    }

    public InventoryPage addBoltTShirt() {
        return inventoryPage.addBoltTShirtToCart();
    }

    public InventoryPage addRedTShirt() {
        return inventoryPage.addRedTShirtToCart();
    }

    public InventoryPage addBikeLight() {
        return inventoryPage.addFleeceJacketToCart();
    }

    public InventoryPage addOnesie() {
        return inventoryPage.addOnesieToCart();
    }


}
