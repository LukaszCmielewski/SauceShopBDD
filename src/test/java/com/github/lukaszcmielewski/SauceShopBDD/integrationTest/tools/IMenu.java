package com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools;

import org.junit.jupiter.api.Test;

public interface IMenu {

    public void clickAboutMenu();
    public void clickLogoutLink();
    public void goToCart();
    public void returnPageTitle();
    public void checkMenuElements();
}
