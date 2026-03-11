package com.BALCO_Project.stepDefinitions;

import com.BALCO_Project.base.BaseClass;
import com.BALCO_Project.pom.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage_Step extends BaseClass {

    LoginPage login;

    @Given("User is in the Balco LogBook Application")
    public void user_is_in_the_balco_log_book_application() {

        login = new LoginPage(driver);
    }

    @When("User enter valid Username")
    public void user_enter_valid_username() {

        login.enterUsername("1020");
    }

    @When("User enter valid Password")
    public void user_enter_valid_password() {

        login.enterPassword("Ntsp1@2023");
    }

    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {

        login.clickLoginBtn();
    }
}