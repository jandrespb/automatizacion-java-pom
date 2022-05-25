package com.saucedemo.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.saucedemo/feature/Login.feature",
glue = "com.saucedemo.stepdefinition",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class LoginRunner {
}
