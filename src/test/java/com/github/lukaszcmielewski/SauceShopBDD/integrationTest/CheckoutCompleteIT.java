package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.CheckoutCompleteTool;
import com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools.IMenu;
import com.github.lukaszcmielewski.SauceShopBDD.page.CheckoutCompletePage;
import org.junit.jupiter.api.*;

import java.util.concurrent.ThreadLocalRandom;

public class CheckoutCompleteIT extends Base implements IMenu {
    int sizeOfCart;
    CheckoutCompletePage page;

    @BeforeEach
    public void init() {
        sizeOfCart = ThreadLocalRandom.current().nextInt(1, 6);
        page = CheckoutCompleteTool.goToCheckoutComplete(sizeOfCart);
    }

    @Test
    public void backToInventoryPage() {
        Assertions.assertEquals("Products", page.backHome().returnPageTitle());
    }

    @Test
    public void checkElementPage() {
        Assertions.assertTrue(page.checkDisplayedElements());
        Assertions.assertEquals("Thank you for your order!", page.returnCompleteHeader());
        Assertions.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", page.returnCompleteText());
    }

    //MenuTests
    @Test
    public void returnPageTitleIMenu() {
        Assertions.assertEquals("Checkout: Complete!", page.returnPageTitle());
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
