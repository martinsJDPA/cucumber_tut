
#  This script shows how "Scenario Outlines" works. It uses examples to read in multiple variables.

 Feature: Login Feature
   Scenario Outline: Login fail - possible outcomes
     Given user is on application landingpage
     When user clicks on sign in button
     Then user us displayed login screen
     When user enters "<UserName>" in username field
     And user enters "<password>" in password field
     And user clicks Sign in button
     Then user gets login failed error message

     Examples:
     | UserName | Password |
     | incorrectusername | 123456 |
     | naveenautomation  | incorrectpassword |
     | incorrectusername   | incorrectpassword |





