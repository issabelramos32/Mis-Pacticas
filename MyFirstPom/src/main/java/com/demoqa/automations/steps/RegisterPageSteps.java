package com.demoqa.automations.steps;

import com.demoqa.automations.models.DataInjection;
import com.demoqa.automations.pageobjects.RegisterPage;
import com.demoqa.automations.util.Javascript;
import com.demoqa.automations.util.Times;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class RegisterPageSteps {
    RegisterPage registerPage = new RegisterPage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser(){ registerPage.open();  }

    @Step
    public void registerNewUser() throws InterruptedException {
        registerPage.getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Times.waitFor(2000);
        registerPage.sendName(dataInjection.getName());
        registerPage.sendLastName(dataInjection.getLastName());
        registerPage.sendEmail(dataInjection.getEmail());
        registerPage.ClickGenderCheckbox();
        registerPage.sendMobileNumber(dataInjection.getMobileNumber());
        registerPage.sendSubject(dataInjection.getSubject());
        Javascript.scrollVertical(registerPage.getDriver());
        Times.waitFor(5000);
        registerPage.clickHobbiesCheckbox();
        Javascript.scrollVertical(registerPage.getDriver());
        registerPage.clickPicture(dataInjection.getPicture());
        registerPage.sendCurrentAddress(dataInjection.getCurrentAddress());
        registerPage.sendStateInput(dataInjection.getState());
        registerPage.enterStateInput();
        registerPage.sendCityInput(dataInjection.getCity());
        registerPage.enterCityInput();
        Times.waitFor(5000);
        Javascript.clickJS(registerPage.getDriver(), registerPage.submitButton);

    }
    public void publicity(){registerPage.closePublicity();}

    @Step
    public void validationSubmittingSuccessful() throws InterruptedException {
        Times.waitFor(2000);
        registerPage.validations(dataInjection.getExtensionSubmit());
        Javascript.scrollVertical(registerPage.getDriver());
        Javascript.clickJS(registerPage.getDriver(),registerPage.closeButton);
        Times.waitFor(3000);

    }
}
