package com.saucedemo.pageobject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPageObject extends PageObject {

    // Locators
    By txtUser = By.id("user-name");
    By txtPassword = By.id("password");
    By btnLogin = By.name("login-button");
    By lblTitleHomePage = By.className("app_logo");
    By btnMenuOptionHomePage = By.id("react-burger-menu-btn");
    By btnLogOut = By.id("logout_sidebar_link");

    // Methods (actions that our robot will do)
    public void writeUsernameLogin(String user){
        getDriver().findElement(txtUser).sendKeys(user);
        System.out.println("user: " + user);
    }

    public void writeUserpasswordLogin (String password){
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public void pressButtonLogin(){
        getDriver().findElement(btnLogin).click();
    }

    public void seeTitleHomePage(){
        WebElement title = getDriver().findElement(lblTitleHomePage);

        if(title.isEnabled()){
            System.out.println("Welcome to Swag Lab!!");
        }
    }

    public void logOutHomePage(){
        getDriver().findElement(btnMenuOptionHomePage).click();
        getDriver().findElement(btnLogOut).click();
        System.out.println("Close session successful!!");
    }
}
