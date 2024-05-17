
  Feature: Calculate billing Amount

    Scenario Outline: billing amount
      Given user is on billing page
      When user enters billing amount "<billingamount>"
      And user enters tax amount "<taxamount>"
      And user clicks on calculate button
      Then it gives the final amount "<finalamount>"

#   Notice that the variables above have been spec'd as strings, it is to avoid
#  issues with mixing int, float or double data types common with some Cucumber versions

      Examples:
      | billingamount | taxamount | finalamount|
      | 1000 | 10 | 1010|
      | 500 | 20 | 520|
      | 100 | 5.5 | 105.5|

