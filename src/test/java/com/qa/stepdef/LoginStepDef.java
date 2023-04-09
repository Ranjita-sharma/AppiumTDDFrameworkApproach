package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("click on Login options")
    public void clickOnLoginOptions() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User enters the username as {string}")
    public void userEntersTheUsernameAs(String username) throws InterruptedException {
    new LoginPage().enterUserName(username);
        Thread.sleep(5000);

    }
    @When("User enters the password as {string}")
    public void userEntersThePasswordAs(String password) throws InterruptedException {
        new LoginPage().enterPassword(password);
        Thread.sleep(5000);

    }
    @When("User click on login button")
    public void userClickOnLoginButton() {
       new LoginPage().pressLoginBtn();

    }
    @Then("User should see Product page with title {string}")
    public void userShouldSeeProductPageWithTitle(String title) {
     Assert.assertEquals(new ProductsPage().getTitle(),title);
    }

    @Given("User's logged in")
    public void userSLoggedIn() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("The product is listed with title {string} and price {string}")
    public void theProductIsListedWithTitleAndPrice(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }

//    @Given("click on Login options")
//    public void clickOnLoginOptions() {
//        // Write code here that turns the phrase above into concrete actions
//
//    }
//    @When("User enters the username as {string}")
//    public void userEntersTheUsernameAs(String string) {
//        // Write code here that turns the phrase above into concrete actions
//
//    }
//    @When("User enters the password as {string}")
//    public void userEntersThePasswordAs(String string) {
//        // Write code here that turns the phrase above into concrete actions
//
//    }
//    @When("User click on login button")
//    public void userClickOnLoginButton() {
//        // Write code here that turns the phrase above into concrete actions
//
//    }
    @Then("Login should fail with an error {string}")
    public void loginShouldFailWithAnError(String err) {
        Assert.assertEquals(new LoginPage().getErrTxt(),err);


    }


    @And("User click on login link")
    public void userClickOnLoginLink() throws InterruptedException {
        Thread.sleep(5000);
        new LoginPage().clickOnLoginLink();
        Thread.sleep(5000);
    }

    @When("User clicks on hamburger icon")
    public void userClicksOnHamburgerIcon() throws InterruptedException {
        Thread.sleep(5000);

        new LoginPage().clickOnMenuIcon();
        Thread.sleep(5000);
    }
}
