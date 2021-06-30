package com.demoqa.automations.steps;

import com.demoqa.automations.models.DataInjection;
import com.demoqa.automations.pageobjects.TextBoxPage;
import com.demoqa.automations.util.Times;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class TextBoxPageSteps {
    TextBoxPage textBoxPage =new TextBoxPage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser(){ textBoxPage.open();  }

    @Step
    public void practiceTexBox () throws InterruptedException {
    textBoxPage.getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Times.waitFor(2000);
    textBoxPage.setFullNameInput(dataInjection.getName());
    textBoxPage.setEmailInput(dataInjection.getEmail());
    textBoxPage.setCurrentAddressInput(dataInjection.getCurrentAddress());
    textBoxPage.setPermanentAddressInput(dataInjection.getPermanentAddress());
    textBoxPage.clickSubmitButton();
    }
}
