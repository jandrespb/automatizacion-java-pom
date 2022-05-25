package com.saucedemo.stepdefinition;

import com.saucedemo.model.LoginModel;
import com.saucedemo.step.LoginStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinition {

    @Steps
    LoginStep user_gonna;

    @Given("^User open browser on swag lab page$")
    public void userOpenBrowserOnSwagLabPage() {
        user_gonna.openBrowserSwagLabs();
    }

    @And("^User validate credentials in login form$")
    public void userValidateCredentialsInLoginForm(List<LoginModel> modelOption) {
        user_gonna.writeUsernameLogin(modelOption.get(0).getUsername());
        user_gonna.writeUserpasswordLogin(modelOption.get(0).getPassword());
        user_gonna.pressButtonLogin();
    }

    @When("^User access to home page successful$")
    public void userAccessToHomePageSuccessful() {
        user_gonna.seeTitleHomePage();
    }

    @Then("^User log out and close browser$")
    public void userLogOutAndCloseBrowser() {
        user_gonna.logOutHomePage();
    }
}
