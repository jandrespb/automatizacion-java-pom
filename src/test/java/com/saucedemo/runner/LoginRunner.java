package com.saucedemo.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.saucedemo/feature/Login.feature",
glue = "com.saucedemo.stepdefinition",
snippets = SnippetType.CAMELCASE)
public class LoginRunner {
}
