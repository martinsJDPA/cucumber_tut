# This tests tags


Feature: UberBooking Feature

  @Smoke
    Scenario: Booking Cab Nissan
    Given User wants to select a car type "Nissan" from uber app
    When User selects car "Nissan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 100 USD

  @Regress
    Scenario: Booking Cab FORD
    Given User wants to select a car type "FORD" from uber app
    When User selects car "FORD" and pick up point "Paris" and drop location "London"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1450 USD

  @Prod
    Scenario: Booking Cab MINI
    Given User wants to select a car type "MINI" from uber app
    When User selects car "MINI" and pick up point "Lagos" and drop location "Kano"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 240 USD