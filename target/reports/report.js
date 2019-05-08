$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/CoverCheckTest/VerifyVehicleIsCovered.feature");
formatter.feature({
  "line": 1,
  "name": "Verify a vehicle exists",
  "description": "  As a user\r\n  I\u0027d like to be able to check if a vehicle exists\r\n  So that I can check the details of cover for the vehicle",
  "id": "verify-a-vehicle-exists",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9609713100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "As a user I can verify if a vehicle exists when I enter the vehicle registration number",
  "description": "",
  "id": "verify-a-vehicle-exists;as-a-user-i-can-verify-if-a-vehicle-exists-when-i-enter-the-vehicle-registration-number",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    },
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter a valid vehicle registration number",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be able to see if the vehicle exists",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should be able to see the start date and time of the cover",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to see the date and time the cover will end",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefs.i_am_on_homepage()"
});
formatter.result({
  "duration": 322850400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_enter_a_valid_vehicle_registration_number()"
});
formatter.result({
  "duration": 898449800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_should_be_able_to_see_if_the_vehicle_exists()"
});
formatter.result({
  "duration": 53800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_should_be_able_to_see_the_start_date_and_time_of_the_cover()"
});
formatter.result({
  "duration": 37900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.i_should_be_able_to_see_the_date_and_time_the_cover_will_end()"
});
formatter.result({
  "duration": 39800,
  "status": "passed"
});
formatter.after({
  "duration": 1696763100,
  "status": "passed"
});
});