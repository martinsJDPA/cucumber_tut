
#  This script demonstrates how Datatable works in cucumber
#    Datatable holds columns/rows of values. It can use both lists and Maps

  Feature: User registration using DataTable

    Scenario: registering multiple users
      Given user is on registration page
      When user enters following details
        | tom | Peters | tompet@gmail.com | 342632 | London |
        | Luke | Stark | luke@gmail.com | 636362 | Paris   |
        | Adil | Penshar | apd@jrtu.com | 89833  | Goa     |
      Then user should be successful


    Scenario: registering multiple users with columns
      Given user is on registration page
      When user enters following details with columns
        | FirstName | LastName | Email | Phone | City |
        | tom | Peters | tompet@gmail.com | 342632 | London |
        | Luke | Stark | luke@gmail.com | 636362 | Paris   |
        | Adil | Penshar | apd@jrtu.com | 89833  | Goa     |
      Then user should be successful
