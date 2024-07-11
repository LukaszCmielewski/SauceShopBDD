package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLabsPage extends BasePage {
    @FindBy(linkText = "Careers")
    WebElement careersLink;

    public SauceLabsPage() {
        super();
    }

    public String getCareersTestLink() {
        return careersLink.getText();
    }
}
