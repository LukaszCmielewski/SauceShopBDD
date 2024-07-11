package com.github.lukaszcmielewski.SauceShopBDD.integrationTest;

import com.github.lukaszcmielewski.SauceShopBDD.util.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver;
    @BeforeEach
    void init() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }
    @AfterEach
    void tearDown() {
        DriverFactory.quitDriver();
    }
}

