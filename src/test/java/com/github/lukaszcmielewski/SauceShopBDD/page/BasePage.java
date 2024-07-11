package com.github.lukaszcmielewski.SauceShopBDD.page;

import com.github.lukaszcmielewski.SauceShopBDD.util.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage()  {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void goTo(String url){
        driver.get("https://www.saucedemo.com/");
    }
}
