package com.saucedemo.pageobject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPageObject extends PageObject {

    // Locators
    By txtUser = By.id("user-name");
    By txtPassword = By.id("password");
    By btnLogin = By.name("login-button");

}
