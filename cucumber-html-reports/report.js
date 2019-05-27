$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Automationpractice_Register.feature");
formatter.feature({
  "line": 1,
  "name": "automationpractice.com automtion",
  "description": "Covers Register, Sign-in in http://automationpractice.com/\r\nValidation criteria : User should be logged in to check out the product",
  "id": "automationpractice.com-automtion",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Register with valid credential",
  "description": "",
  "id": "automationpractice.com-automtion;register-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@valid_emailAddress"
    },
    {
      "line": 23,
      "name": "@valid_registration"
    },
    {
      "line": 23,
      "name": "@PositiveScenario"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Load test data for \"\u003cTestCase\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user is on Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User navigates to SignIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User enters \"valid\" Email Address",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Enter personal information",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "click on Register",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "automationpractice.com-automtion;register-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "TestCase"
      ],
      "line": 35,
      "id": "automationpractice.com-automtion;register-with-valid-credential;;1"
    },
    {
      "cells": [
        "TC_2"
      ],
      "line": 36,
      "id": "automationpractice.com-automtion;register-with-valid-credential;;2"
    },
    {
      "cells": [
        "TC_3"
      ],
      "line": 37,
      "id": "automationpractice.com-automtion;register-with-valid-credential;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4820099099,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 36,
  "name": "Register with valid credential",
  "description": "",
  "id": "automationpractice.com-automtion;register-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@valid_emailAddress"
    },
    {
      "line": 23,
      "name": "@PositiveScenario"
    },
    {
      "line": 23,
      "name": "@valid_registration"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Load test data for \"TC_2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user is on Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User navigates to SignIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User enters \"valid\" Email Address",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Enter personal information",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "click on Register",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Account created successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TC_2",
      "offset": 20
    }
  ],
  "location": "Steps.loadTestDataFor(String)"
});
formatter.result({
  "duration": 1412909197,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userIsOnHomePage()"
});
formatter.result({
  "duration": 8280352926,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userNavigatesToSignInPage()"
});
formatter.result({
  "duration": 2930884254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 13
    }
  ],
  "location": "Steps.userEntersEmailAddress(String)"
});
formatter.result({
  "duration": 243754388,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clickOnCreateAnAccount()"
});
formatter.result({
  "duration": 141370976,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enterPersonalInformation()"
});
formatter.result({
  "duration": 4551309739,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clickOnRegister()"
});
formatter.result({
  "duration": 3304103124,
  "status": "passed"
});
formatter.match({
  "location": "Steps.accountCreatedSuccessfully()"
});
formatter.result({
  "duration": 58883442,
  "status": "passed"
});
formatter.after({
  "duration": 149730,
  "status": "passed"
});
formatter.after({
  "duration": 189415953,
  "status": "passed"
});
formatter.before({
  "duration": 3779730162,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 37,
  "name": "Register with valid credential",
  "description": "",
  "id": "automationpractice.com-automtion;register-with-valid-credential;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@valid_emailAddress"
    },
    {
      "line": 23,
      "name": "@PositiveScenario"
    },
    {
      "line": 23,
      "name": "@valid_registration"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Load test data for \"TC_3\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user is on Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User navigates to SignIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User enters \"valid\" Email Address",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "click on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Enter personal information",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "click on Register",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Account created successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TC_3",
      "offset": 20
    }
  ],
  "location": "Steps.loadTestDataFor(String)"
});
formatter.result({
  "duration": 81104954,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userIsOnHomePage()"
});
formatter.result({
  "duration": 8033993973,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userNavigatesToSignInPage()"
});
formatter.result({
  "duration": 2831767717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 13
    }
  ],
  "location": "Steps.userEntersEmailAddress(String)"
});
formatter.result({
  "duration": 582707600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clickOnCreateAnAccount()"
});
formatter.result({
  "duration": 146857225,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enterPersonalInformation()"
});
formatter.result({
  "duration": 4072102483,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clickOnRegister()"
});
formatter.result({
  "duration": 2290425841,
  "status": "passed"
});
formatter.match({
  "location": "Steps.accountCreatedSuccessfully()"
});
formatter.result({
  "duration": 48336587,
  "status": "passed"
});
formatter.after({
  "duration": 43470,
  "status": "passed"
});
formatter.after({
  "duration": 302366144,
  "status": "passed"
});
});