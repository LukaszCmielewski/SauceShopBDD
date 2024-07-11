package com.github.lukaszcmielewski.SauceShopBDD.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    protected static WebDriver _driver ;

    public static WebDriver getBrowser() {
        _driver = new ChromeDriver();
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return _driver;
    }

    public static WebDriver getDriver() {
        if (_driver == null) {
            _driver = new ChromeDriver();
        }
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return _driver;
    }

    public static void waiter(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void quitDriver() {
        if (_driver != null) {
            _driver.quit();
            _driver = null;
        }
    }
}
