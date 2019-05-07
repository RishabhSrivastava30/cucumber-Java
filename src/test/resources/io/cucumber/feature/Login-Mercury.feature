
@Regression
Feature: Validation of Mercury Flight Login


  Scenario: Verification of Mercury Flight Login for Valid user
    Given I launch Mercury Flight login Application
    And Login to app using id as "mercury.user.id" and password as "mercury.user.password"
    Then I see my image and Logout button.
 
