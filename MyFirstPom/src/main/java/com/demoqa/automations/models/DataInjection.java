package com.demoqa.automations.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String name, email, lastName, mobileNumber, currentAddress,
             subject, state, city, extensionSubmit, picture, permanentAddress;

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getSubject() {
        return subject;
    }
    public String getPicture(){return picture;}
    public String getCurrentAddress() {
        return currentAddress;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }
    public String getPermanentAddress() {return permanentAddress;
    }

    public String getExtensionSubmit() {return extensionSubmit;    }

    public DataInjection() {
        this.name = faker.name().name();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.mobileNumber = Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.currentAddress = faker.address().fullAddress();
        this.permanentAddress = faker.address().secondaryAddress();

        this.picture="C:\\Users\\Isabel\\Downloads\\perfil.png";

        this.state = "Haryana";
        this.city = "Panipat";
        this.subject = "Match and Spanish";
        this.extensionSubmit = "Thanks for submitting the form";

    }

}
