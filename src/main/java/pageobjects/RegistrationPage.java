package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;


public class RegistrationPage {
    WebDriver driver;

    @FindBy(id = "id_gender2")
    private WebElement titleMrs;

    @FindBy(id = "id_gender1")
    private WebElement titleMr;

    @FindBy(id = "customer_firstname")
    private WebElement customer_firstname;

    @FindBy(id = "customer_lastname")
    private WebElement customer_lastname;

    @FindBy(id = "passwd")
    private WebElement passwd;

    @FindBy(id = "days")
    private WebElement days;

    @FindBy(id = "months")
    private WebElement months;

    @FindBy(id = "years")
    private WebElement years;

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "postcode")
    private WebElement postcode;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "address1")
    private WebElement address1;

    @FindBy(id = "address2")
    private WebElement address2;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "other")
    private WebElement other;

    @FindBy(id = "phone_mobile")
    private WebElement phone_mobile;

    @FindBy(id = "alias")
    private WebElement alias;

    @FindBy(id = "submitAccount")
    private WebElement registerAccount;

    @FindBy(xpath = "//*[@id='center_column']/p")
    private WebElement successMessage;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterPersonalInfo(HashMap<String, String> datamap) {
        String fName = datamap.get("firstname");
        String lName = datamap.get("lastname");
        String password = datamap.get("password");
        String title = datamap.get("title");
        String birthday = datamap.get("birthday");
        String companyInput = datamap.get("company");
        String address1Input = datamap.get("address1");
        String address2Input = datamap.get("address2");
        String cityInput = datamap.get("City");
        String postalCodeInput = datamap.get("PostalCode");
        String stateInput = datamap.get("State");
        String otherInput = datamap.get("other");
        String phoneNumberInput = datamap.get("phoneNumber");
        String aliasInput = datamap.get("alias");
        if (title != null && title.equalsIgnoreCase("Mr.")) {
            titleMr.click();
        } else {
            titleMrs.click();
        }
        customer_firstname.sendKeys(fName);
        customer_lastname.sendKeys(lName);
        passwd.sendKeys(password);
        String[] birthDates = birthday.split("/");
        Select day = new Select(days);
        Select month = new Select(months);
        Select year = new Select(years);
        day.selectByValue(birthDates[0]);
        month.selectByValue(birthDates[1]);
        year.selectByValue(birthDates[2]);
        company.sendKeys(companyInput);
        address1.sendKeys(address1Input);
        address2.sendKeys(address2Input);
        city.sendKeys(cityInput);
        Select states = new Select(state);
        states.selectByValue(stateInput);
        postcode.sendKeys(postalCodeInput);
        other.sendKeys(otherInput);
        phone_mobile.sendKeys(phoneNumberInput);
        alias.sendKeys(aliasInput);
    }

    public void clickOnRegister() {
        registerAccount.click();
    }
    public void validateAccountCreation(HashMap<String, String> data) {
        Assert.assertTrue("Success Message Validation Failed.",data.get("Success_Message").equalsIgnoreCase(successMessage.getText()));
    }

    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}

