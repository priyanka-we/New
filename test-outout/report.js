$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/91963/eclipse-workspace/Project/WeAd/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "WeAdmit Login Page",
  "description": "",
  "id": "weadmit-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "WeAdmit Login Page Scenario",
  "description": "",
  "id": "weadmit-login-page;weadmit-login-page-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is present on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of Login Page is WeAdmit",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and user enters password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_present_login_page()"
});
formatter.result({
  "duration": 9904927800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.title_of_login_page_is_WeAdmit()"
});
formatter.result({
  "duration": 15949700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_enters_username_and_password()"
});
formatter.result({
  "duration": 312596800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 319718000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_is_on_home_page()"
});
formatter.result({
  "duration": 6963800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.close_browser()"
});
formatter.result({
  "duration": 971580700,
  "status": "passed"
});
});