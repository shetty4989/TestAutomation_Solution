package pageobjects;

import com.sun.media.jfxmedia.logging.Logger;
import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

import managers.FileReaderManager;
import utils.RandomDataGenerator;

import java.util.HashMap;
import java.util.List;


public class SignInPage {
    WebDriver driver;

    @FindBy(id = "email_create")
    private WebElement emailCreateTextbox;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButton;

    @FindBy(linkText = "Sign in")
    private WebElement signIn;

    @FindBy(xpath = "//*[@id=\"create_account_error\"]/ol/li")
    private WebElement alertDanger;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void createAccountButtonClick() {
        createAccountButton.click();
    }

    public void enterEmailAddress(HashMap<String, String> datamap, String validOrInvalid) {
        if (validOrInvalid.equalsIgnoreCase("invalid"))
            emailCreateTextbox.sendKeys(new RandomDataGenerator().newInvalidEmail());

        else if (validOrInvalid.equalsIgnoreCase("valid"))
            emailCreateTextbox.sendKeys(new RandomDataGenerator().newValidEmail());

        else if (validOrInvalid.equalsIgnoreCase("Already_Used"))
            emailCreateTextbox.sendKeys(datamap.get("email_in_use"));
    }

    public void validateErrorMessage(String errorMessage) {
        System.out.println("Error Message:" + alertDanger.getText());
        Assert.assertTrue("Error Message Validation Failed.", errorMessage.equalsIgnoreCase(alertDanger.getText()));
    }

    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}

