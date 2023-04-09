package com.qa.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDef {
//    @Given("User's logged in")
//    public void userSLoggedIn() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @When("User click on product title {string}")
    public void userClickOnProductTitle(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("User should be on product details page with title {string}, price {string} and description {string}")
    public void userShouldBeOnProductDetailsPageWithTitlePriceAndDescription(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions

    }

}
