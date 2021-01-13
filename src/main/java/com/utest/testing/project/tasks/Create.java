package com.utest.testing.project.tasks;

import com.utest.testing.project.userinterface.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.interactions.Actions;

public class Create implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthDay;
    private String strBirthMonth;
    private String strBirthYear;
    private String strCity;
    private String strState;
    private String strPostalCode;
    private String strCountry;
    private String strYourComputer;
    private String strVersion;
    private String strLanguage;
    private String strYourMobileDevice;
    private String strModel;
    private String strOperatingSystem;
    private String strCreateYourUTestPassword;
    private String strConfirmPassword;

    public Create(String strFirstName, String strLastName, String strEmail, String strBirthDay, String strBirthMonth, String strBirthYear, String strCity, String strState, String strPostalCode, String strCountry, String strYourComputer, String strVersion, String strLanguage, String strYourMobileDevice, String strModel, String strOperatingSystem, String strCreateYourUTestPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthDay = strBirthDay;
        this.strBirthMonth = strBirthMonth;
        this.strBirthYear = strBirthYear;
        this.strCity = strCity;
        this.strState = strState;
        this.strPostalCode = strPostalCode;
        this.strCountry = strCountry;
        this.strYourComputer = strYourComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strYourMobileDevice = strYourMobileDevice;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;
        this.strCreateYourUTestPassword = strCreateYourUTestPassword;
        this.strConfirmPassword = strConfirmPassword;
    }


    public static Create theAccount(String strFirstName, String strLastName, String strEmail, String intBirthDay, String strBirthMonth, String intBirthYear, String strCity, String strState, String intPostalCode, String strCountry, String strYourComputer, String strVersion, String strLanguage, String strYourMobileDevice, String strModel, String strOperatingSystem, String strCreateYourUTestPassword, String strConfirmPassword) {
        return Tasks.instrumented(Create.class, strFirstName, strLastName, strEmail, intBirthDay, strBirthMonth, intBirthYear, strCity, strState, intPostalCode, strCountry, strYourComputer, strVersion, strLanguage, strYourMobileDevice, strModel, strOperatingSystem, strCreateYourUTestPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(CreateAccountPage.BUTTON_REGISTER),
                Enter.theValue(strFirstName).into(CreateAccountPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(CreateAccountPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(CreateAccountPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(CreateAccountPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(CreateAccountPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(CreateAccountPage.SELECT_BIRTH_YEAR),
                Click.on(CreateAccountPage.BUTTON1_NEXT)
        );

        actor.attemptsTo(
                Enter.theValue(strCity, " ", strState).into(CreateAccountPage.INPUT_CITY),
                WaitUntil.the(CreateAccountPage.GOOGLE_LOCATION_ITEM, WebElementStateMatchers.isVisible()),
                MoveMouse.to(CreateAccountPage.GOOGLE_LOCATION_ITEM).andThen(Actions::click),
                Enter.theValue(strPostalCode).into(CreateAccountPage.INPUT_POSTAL_CODE),
                Click.on(CreateAccountPage.SELECT_COUNTRY),
                Enter.theValue(strCountry).into(CreateAccountPage.INPUT_COUNTRY),
                Click.on(CreateAccountPage.COUNTRY_ITEM),
                Click.on(CreateAccountPage.BUTTON2_NEXT)
        );

        actor.attemptsTo(
                Click.on(CreateAccountPage.SELECT_YOUR_COMPUTER),
                Enter.theValue(strYourComputer).into(CreateAccountPage.INPUT_YOUR_COMPUTER),
                Click.on(CreateAccountPage.YOUR_COMPUTER_ITEM),
                Click.on(CreateAccountPage.SELECT_VERSION),
                Enter.theValue(strVersion).into(CreateAccountPage.INPUT_VERSION),
                Click.on(CreateAccountPage.YOUR_VERSION),
                Click.on(CreateAccountPage.SELECT_LANGUAGE),
                Enter.theValue(strLanguage).into(CreateAccountPage.INPUT_LANGUAGE),
                Click.on(CreateAccountPage.YOUR_LANGUAGE),
                Click.on(CreateAccountPage.SELECT_YOUR_MOBILE),
                Enter.theValue(strYourMobileDevice).into(CreateAccountPage.INPUT_YOUR_MOBILE),
                Click.on(CreateAccountPage.YOUR_MOBILE),
                Click.on(CreateAccountPage.SELECT_MODEL),
                Enter.theValue(strModel).into(CreateAccountPage.INPUT_MODEL),
                Click.on(CreateAccountPage.YOUR_MODEL),
                Click.on(CreateAccountPage.SELECT_OPERATING_SYSTEM),
                Enter.theValue(strOperatingSystem).into(CreateAccountPage.INPUT_OPERATING_SYSTEM),
                Click.on(CreateAccountPage.YOUR_OPERATING_SYSTEM),
                Click.on(CreateAccountPage.BUTTON3_NEXT)
        );

        actor.attemptsTo(
                Enter.theValue(strCreateYourUTestPassword).into(CreateAccountPage.CREATE_PASSWORD),
                Enter.theValue(strConfirmPassword).into(CreateAccountPage.CONFIRM_PASSWORD),
                Click.on(CreateAccountPage.TERMS_AND_CONDITIONS),
                Click.on(CreateAccountPage.PRIVACITY_AND_SECURITY_POLICY),
                Click.on(CreateAccountPage.BUTTON_COMPLETE_REGISTER),
                WaitUntil.the(CreateAccountPage.WELCOME_MESSAGE, WebElementStateMatchers.isVisible())
        );
    }
}
