@Regression @Smoke @HomePage.feature
  Feature: Home Page Validation

    Scenario: Validate home page title and Create Primary Account button
      Given the user is on the home page
      Then the page title should be "TEK Insurance UI"
      And the "Create Primary Account" button should be present