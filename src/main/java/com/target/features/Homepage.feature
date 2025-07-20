Feature: Target Website Shopping Functionality

  As a user
  I want to search for products, add them to my cart, and verify the cart contents
  So that I can shop online at Target conveniently

 	Background:

    Given I launch the Target Homepage

  @SearchProduct
  @regression
  @smoke
  Scenario: Search for a product
    When I enter "Bluetooth Headphones" into the search bar
    And I click the search button
    When search results for "Bluetooth Headphones" should be displyed
    Then close the browser

  #@AddToCart
  #@regression
  #@smoke
  #Scenario: Add a product to the cart
    #When I search for "iPhones"
    #And I click the search button
    #And I select the first product from the results
    #Then I select delivery method and add to the cart
    #And the product should be successfully added to the cart
    #Then close the browser

#	@smoke
  #@ViewCart
  #Scenario: Verify cart contents
    #When I navigate to the cart
    #And the cart should display the added product
    #Then close the browser
#
  #@SignIn
  #@smoke
  #Scenario: Sign in to the Target website
  #	When I click on account button
    #And I click on the sign-in or create account button
    #When I enter a valid "email" in the box
    #And I clicks on continue button
  #	Then I enter a valid "password" in the box
    #And I click on signe in with password button
    #Then I should be logged into my account successfully
    