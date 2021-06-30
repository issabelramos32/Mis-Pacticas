package com.demoqa.test.stepdefinitions;


import com.demoqa.automations.steps.TextBoxPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class PracticeTextBoxStepDefinitions {

    @Steps
    TextBoxPageSteps textBoxPageSteps;


    @Given("^a web user whats to enter box$")
    public void aWebUserWhatsToEnterBox() {
        textBoxPageSteps.openBrowser();
    }


    @When("^he fills all the requested fields in text box section$")
    public void heFillsAllTheRequestedFieldsInTextBoxSection() throws InterruptedException {
    textBoxPageSteps.practiceTexBox();
        }

    @Then("^he should see him data down$")
    public void heShouldSeeHimDataDown() {
    }

}
