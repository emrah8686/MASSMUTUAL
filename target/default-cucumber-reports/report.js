$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Exercise.feature");
formatter.feature({
  "name": "Exercise Value Validation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User get that url \"http://dummy.restapiexample.com/api/v1/employees\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User see screen as successfully open",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Verify result when all step passed as expected",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@end_2_end_testing"
    }
  ]
});
formatter.step({
  "name": "User should send correct value to each element on page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should see total balance equal to sum of values",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});