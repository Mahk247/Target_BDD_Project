$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/com/target/features/Homepage.feature");
formatter.feature({
  "name": "Target Website Shopping Functionality",
  "description": "  As a user\n  I want to search for products, add them to my cart, and verify the cart contents\n  So that I can shop online at Target conveniently",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I launch the Target Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.target.steps.StepDefinations.i_launch_the_Target_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for a product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SearchProduct"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enter \"Bluetooth Headphones\" into the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "com.target.steps.StepDefinations.i_enter_into_the_search_bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.target.steps.StepDefinations.i_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search results for \"Bluetooth Headphones\" should be displyed",
  "keyword": "When "
});
formatter.match({
  "location": "com.target.steps.StepDefinations.search_results_for_should_be_displyed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.target.steps.StepDefinations.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});