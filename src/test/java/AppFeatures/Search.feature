
  Feature: Amazon Search

    @mac
    Scenario: Search a product
      Given I have a search field on Amazon page
      When I search for a product with name "Apple Macbook Pro" and price 1000
      Then Product with name "Apple Macbook Pro" should be displayed
      Then Order_id is 2345 and username is "my apple prod"

  @iphone
    Scenario: Search a product Iphone
      Given I have a search field on Amazon page
      When I search for a product with name "iPhone" and price 200
      Then Product with name "iPhone" should be displayed
      Then Order_id is 5663 and username is "automated cred"