package com.saucedemo.step;

import com.saucedemo.pageobject.LoginPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class LoginStep {

    LoginPageObject method_gonna = new LoginPageObject();

    @Step("User open browser and try to access on page swag labs")
    public void openBrowserSwagLabs(){
        method_gonna.open();
    }

    @Step ("User write the username on login form")
    public void writeUsernameLogin (String user){
        method_gonna.writeUsernameLogin(user);
    }

    @Step("User write the password on login form")
    public void writeUserpasswordLogin (String password){
        method_gonna.writeUserpasswordLogin(password);
    }

    @Step("User push button login")
    public void pressButtonLogin(){
        method_gonna.pressButtonLogin();
    }

    @Step("User can see the title SwagLabs")
    public void seeTitleHomePage(){
       method_gonna.seeTitleHomePage();
    }

    @Step("User log out on homepage")
    public void logOutHomePage(){
        method_gonna.logOutHomePage();
    }
}
