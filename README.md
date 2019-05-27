# CucumberJavaFramework

BDD: Java Maven Cucumber Selenium Webdriver Setup
Java + Junit + Cucumber + Selenium +Maven + Apache POI 
This repo contains the Maven setup for Cucumber (BDD)-Selenium for scenarios to Register, Sign-in in http://automationpractice.com/ .

## Design Pattern: 
Page Object Model (PageFactory)

## Data Driven Approach: 
Implemented using cucumber scenario outline and Apache POI utilities.

## Scenario Picked for testing:
•	User should be able to register using a valid email address
•	While registering, if the email address is incorrect. User should see an error message


## Tags Used: 
```
 @invalid_emailAddress @NegativeScenario
 Scenario: Registering with invalid email address and email address already in use.

 @valid_emailAddress @valid_registration @PositiveScenario
 Scenario: Register with valid email address and other required details
 ```
 
## Setup
Install on Local Machine
Install Java & Maven on your local machine
Git clone the below repo and set up the same in an IDE.
•	git@github.com:shetty4989/CucumberJavaFramework.git

## To Run (Maven command line)
### enable profile id 'Browser_Chrome' with -P prod or -D browser=chrome
```
mvn clean test -P Browser_Chrome
mvn clean test -D browser=chrome
```

### enable profile id 'Browser_Firefox' with -P prod or -D browser=firef
```
mvn clean test -P Browser_Firefox
mvn clean test -D browser=firefox
```

### Using cucumber.options to run a particular test-case(s) based on tag(s) dynamically
```
mvn test -Dcucumber.options="--tags @invalid_emailAddress"
```

### Clubbing above 2 configurations triggering @invalid_emailAddress scenario on firefox browser
```
mvn test -P Browser_Firefox -Dcucumber.options="--tags @invalid_emailAddress"
```
 
 
