package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.*;

import java.util.HashMap;


public class Steps {

    TestContext testContext;
    HomePage homePage;
    SignInPage signInPage;
    RegistrationPage registrationPage;
    HashMap<String, String> currentDataMap = new HashMap<>();
    HashMap<String, HashMap<String, String>> dataMap;


    public Steps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        signInPage = testContext.getPageObjectManager().getSignPage();
        registrationPage = testContext.getPageObjectManager().getRegistrationPage();
        dataMap = testContext.getDataSheetManager().data();
    }

    @And("^user is on Home Page$")
    public void userIsOnHomePage() {
        homePage.navigateTo_HomePage();
    }

    @When("^User navigates to SignIn Page$")
    public void userNavigatesToSignInPage() {
        homePage.navigateTo_SignInPage();

    }


    @And("^User enters \"([^\"]*)\" Email Address$")
    public void userEntersEmailAddress(String validOrInvalid) throws Throwable {
        signInPage.enterEmailAddress(currentDataMap, validOrInvalid);

    }

    @And("^click on create an account$")
    public void clickOnCreateAnAccount() {
        signInPage.createAccountButtonClick();
    }

    @Then("^validate for \"([^\"]*)\" error message$")
    public void validateForErrorMessage(String errorMessage) throws Throwable {
        signInPage.validateErrorMessage(errorMessage);
    }

    @And("^Enter personal information$")
    public void enterPersonalInformation() {
        registrationPage.enterPersonalInfo(currentDataMap);
    }

    @And("^click on Register$")
    public void clickOnRegister() {
        registrationPage.clickOnRegister();
    }


    @Given("^Load test data for \"([^\"]*)\"$")
    public void loadTestDataFor(String tcRef) throws Throwable {
        currentDataMap = dataMap.get(tcRef);
    }

    @Then("^Account created successfully$")
    public void accountCreatedSuccessfully() {
        registrationPage.validateAccountCreation(currentDataMap);
    }

}
