# CucumberJavaFramework

#BDD: Java Maven Cucumber Selenium Webdriver Setup
Java + Junit + Cucumber + Selenium +Maven + Apache POI 
This repo contains the Maven setup for Cucumber (BDD)-Selenium for scenarios to Register, Sign-in in http://automationpractice.com/ .

Design Pattern: Page Object Model (PageFactory)
Data Driven Approach: Implemented using cucumber scenario outline and Apache POI utilities.
Scenario Picked for testing:
•	User should be able to register using a valid email address
•	While registering, if the email address is incorrect. User should see an error message


Tags Used: 

 @invalid_emailAddress @NegativeScenario
 Scenario: Registering with invalid email address and email address already in use.

 @valid_emailAddress @valid_registration @PositiveScenario
 Scenario: Register with valid email address and other required details
 
 
