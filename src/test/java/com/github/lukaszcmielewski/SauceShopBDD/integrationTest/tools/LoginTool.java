package com.github.lukaszcmielewski.SauceShopBDD.integrationTest.tools;

import com.github.lukaszcmielewski.SauceShopBDD.page.*;
import org.openqa.selenium.WebDriver;

public class LoginTool {
    public static String password="secret_sauce";
    public static String standardUser="standard_user";
    public static String lockedOutUser="locked_out_user";
    public static String problemUser="problem_user";
    public static String performanceUser="performance_glitch_user";
    public static String errorUser="error_user";
    public static String visualUser="visual_user";


    public InventoryPage login(String name, String pass) {
        return new LoginPage().getLoginPage().insertLoginData(name, pass).clickLoginButton();
    }
}
