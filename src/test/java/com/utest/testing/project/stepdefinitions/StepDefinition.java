package com.utest.testing.project.stepdefinitions;

import com.utest.testing.project.model.CreateAccountData;
import com.utest.testing.project.questions.Answer;
import com.utest.testing.project.tasks.Create;
import com.utest.testing.project.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Eva is a guest she wants to create a new account on the UTest website$")
    public void thanEvaisAGuestSheWantsToCreateANewAccountOnTheUTestWebsite() {
        OnStage.theActorCalled("Eva").wasAbleTo(OpenUp.thePage());
    }

    @When("^she create the new account on the website$")
    public void sheCreateTheNewAccountOnTheWebsite(List<CreateAccountData> createAccountData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Create.theAccount(
                createAccountData.get(0).getStrFirstName(),
                createAccountData.get(0).getStrLastName(),
                createAccountData.get(0).getStrEmail(),
                createAccountData.get(0).getStrBirthDay(),
                createAccountData.get(0).getStrBirthMonth(),
                createAccountData.get(0).getStrBirthYear(),
                createAccountData.get(0).getStrCity(),
                createAccountData.get(0).getStrState(),
                createAccountData.get(0).getStrPostalCode(),
                createAccountData.get(0).getStrCountry(),
                createAccountData.get(0).getStrYourComputer(),
                createAccountData.get(0).getStrVersion(),
                createAccountData.get(0).getStrLanguage(),
                createAccountData.get(0).getStrYourMobileDevice(),
                createAccountData.get(0).getStrModel(),
                createAccountData.get(0).getStrOperatingSystem(),
                createAccountData.get(0).getStrCreateYourUTestPassword(),
                createAccountData.get(0).getStrConfirmPassword()
        ));
    }

    @Then("^she creates the account successfully and can see the welcome message$")
    public void sheCreatesTheAccountSuccessfullyAndCanSeeTheWelcomeMessage(List<CreateAccountData> accountData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(accountData.get(0).getStrConfirmationMessage())));
    }
}
