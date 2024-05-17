
  Feature: Using But keyword

    Scenario: Amazon Login page
      Given user is on Amazon landing page
      And Sign in button is present on screen
      When user clicks on sign in button
      Then user us displayed login screen
      When user enter "username@domain.com" in username field
      And user enters "test123" in pssword field
      And user clicks submit button
      Then user is on home page
      And title of home page is "Amazon"
      But Sign in button is absent


