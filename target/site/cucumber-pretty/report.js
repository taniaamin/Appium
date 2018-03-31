$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotels.feature");
formatter.feature({
  "line": 2,
  "name": "Hotels login feature",
  "description": "",
  "id": "hotels-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@hotels"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on hotel app home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsSD.iAmOnHomePageOfHotels()"
});
formatter.result({
  "duration": 51918921353,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify user receives error message for invalid login username and password",
  "description": "",
  "id": "hotels-login-feature;verify-user-receives-error-message-for-invalid-login-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@hotels-TA10"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I scroll down on page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I tap on Create Account button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I fill out required fields",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I tap on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify successful creation of a home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelsSD.scrollDown()"
});
formatter.result({
  "duration": 62611,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create Account",
      "offset": 9
    }
  ],
  "location": "HotelsSD.tapOn(String)"
});
formatter.result({
  "duration": 1527566469,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "required fields",
      "offset": 11
    }
  ],
  "location": "HotelsSD.fillInformation(String)"
});
formatter.result({
  "duration": 24029001622,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 9
    }
  ],
  "location": "HotelsSD.tapOn(String)"
});
formatter.result({
  "duration": 972071206,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.verifyCreatingAccount()"
});
formatter.result({
  "duration": 3574919503,
  "status": "passed"
});
formatter.after({
  "duration": 979726543,
  "status": "passed"
});
});