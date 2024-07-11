package com.github.lukaszcmielewski.SauceShopBDD.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLabsPage extends BasePage{
    public SauceLabsPage()  {
        super();
    }

    @FindBy(linkText = "Careers")
    WebElement careersLink;

    public String getCareersTestLink() {
        return careersLink.getText();
    }
}
