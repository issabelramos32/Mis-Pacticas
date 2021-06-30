package com.demoqa.test.stepdefinitions;


import com.demoqa.automations.steps.RegisterPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterNewUserStepDefinitios {

    @Steps
    RegisterPageSteps registerPageSteps;

    @Given("^that a web user wants to register in advantage shopping online$")
    public void thatAWebUserWantsToRegisterInAdvantageShoppingOnline(){
        registerPageSteps.openBrowser();
    }


    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields() throws InterruptedException {
        registerPageSteps.publicity();
        Thread.sleep(5000);
        registerPageSteps.registerNewUser();

    }

    @Then("^he should see him username in the homepage$")
    public void heShouldSeeHimUsernameInTheHomepage() throws InterruptedException{
        registerPageSteps.validationSubmittingSuccessful();

    }

}
