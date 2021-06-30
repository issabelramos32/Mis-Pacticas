package com.demoqa.automations.pageobjects;

import com.demoqa.automations.models.DataInjection;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://www.demoqa.com/automation-practice-form")

public class RegisterPage extends PageObject {
    DataInjection dataInjection = new DataInjection();

    public By publicity = By.xpath("//img[@src='https://ad.plus/adplus-advertising.svg']");
    public By nameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By emailInput = By.id("userEmail");
    public By genderCheckbox = By.xpath("//label[@for='gender-radio-1']");
    public By mobileNumberInput = By.id("userNumber");
    public By subjectInput = By.id("subjectsInput");
    public By hobbiesCheckbox = By.xpath("//label[@for='hobbies-checkbox-1']");
    public By selectFile = By.id("uploadPicture");
    public By currentAddressInput = By.id("currentAddress");
    public By stateInput = By.xpath("//*[@id='react-select-3-input' and @type='text']");
    public By cityInput = By.xpath("//*[@id='react-select-4-input' and @type='text']");
    public By submitButton = By.id("submit");
    public By validationOfForm = By.xpath("//*[@id='example-modal-sizes-title-lg' and text()='Thanks for submitting the form']");
    public By closeButton = By.xpath("//*[@id='closeLargeModal' and @type='button']");


    public void sendName(String string) {
        getDriver().findElement(nameInput).sendKeys(string);
    }
    public void sendLastName(String string) {
        getDriver().findElement(lastNameInput).sendKeys(string);
    }
    public void sendEmail(String string) {
        getDriver().findElement(emailInput).sendKeys(string);
    }
    public void ClickGenderCheckbox() {
        getDriver().findElement(genderCheckbox).click();
    }
    public void sendMobileNumber(String string) {
        getDriver().findElement(mobileNumberInput).sendKeys(string);
    }
    public void sendSubject(String string) {
        getDriver().findElement(subjectInput).sendKeys(string);
    }
    public void clickHobbiesCheckbox() {getDriver().findElement(hobbiesCheckbox).click();    }
    public void clickPicture(String string) {getDriver().findElement(selectFile).sendKeys(string); }
    public void sendCurrentAddress(String string) {
        getDriver().findElement(currentAddressInput).sendKeys(string);
    }
    public void sendStateInput(String string){ getDriver().findElement(stateInput).sendKeys(string);}
    public void enterStateInput(){getDriver().findElement(stateInput).sendKeys(Keys.ENTER);}
    public void sendCityInput(String string){
        getDriver().findElement(cityInput).sendKeys(string);
    }
    public void enterCityInput(){
        getDriver().findElement(cityInput).sendKeys(Keys.ENTER);
    }

    //validaciones
    public void validations (String expectSubmitting){
        assertEquals(getDriver().findElement(validationOfForm).getText(), expectSubmitting);
    }
    public void clickCloseButton(){
        getDriver().findElement(closeButton).click();
    }

    public void closePublicity(){

        getDriver().manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        if (getDriver().findElement(publicity).isEnabled()){
            getDriver().findElement(publicity).click();
        }
    }
}