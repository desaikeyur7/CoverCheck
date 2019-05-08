Feature: Verify a vehicle exists
    As a user
    I'd like to be able to check if a vehicle exists
    So that I can check the details of cover for the vehicle

    @Smoke @Regression
    Scenario: As a user I can verify if a vehicle exists when I enter the vehicle registration number
    Given I am on homepage
    When I enter a valid vehicle registration number
    Then I should be able to see if the vehicle exists
    And I should be able to see the start date and time of the cover
    And I should be able to see the date and time the cover will end