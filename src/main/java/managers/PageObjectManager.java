package managers;

import org.openqa.selenium.WebDriver;
import pageobjects.*;


public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private SignInPage signInPage;
    private RegistrationPage registrationPage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;
    }

    public HomePage getHomePage() {

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;

    }

    public SignInPage getSignPage() {

        return (signInPage == null) ? signInPage = new SignInPage(driver) : signInPage;

    }

    public RegistrationPage getRegistrationPage() {

        return (registrationPage == null) ? registrationPage = new RegistrationPage(driver) : registrationPage;

    }


}