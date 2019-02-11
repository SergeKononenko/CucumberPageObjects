@Used-Search-Cars
Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that 
  the Used Search Cars page is working
  Doing the Acceptance Testing

  @Used-Search-Cars-Positive
  Scenario: Validate Used Search Cars Page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide Website
    When I move to the Menu
      | buy + sell |
      | Used       |
    And click "Used" link
    And select carbrand as "AUDI" from AnyMake dropdown
    And select car model
      | carModel |
      | A4       |
      | A3       |
    And select location as "Australia" from SelectLocation dropdown
    And select "$2,000" as price
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Used Audi A4 Under 2000 for Sale | carsguide"
