Feature: Homepage navigation bar
  As a user
  I want to see and use the main navigation bar links on Target homepage
  So that I can easily navigate to different sections

Background:
	Given I am on the Target homepage with "chrome" browser

  Scenario: Verify navigation links are visible and clickable
    
    Then I should see navigation links "Home", "Weekly Ad", "Registry", "Deals", "Find Stores"
    When I click on the "Deals" link
    Then I should be navigated to the Deals page
    Then close the browser
 
  Scenario: Search with a valid product keyword

    When I enter "laptop" in the search bar
    And I submit the search
    Then I should see search results related to "laptop"
    Then close the browser

  Scenario: Verify promotional banners are displayed

    Then I should see at least one promotional banner displayed
    And the banner should contain an image and a clickable link
    Then close the browser

  Scenario: Verify Sign In button presence and navigation

    Then I should see a "Sign In" button
    When I click the "Sign In" button
    Then I should be navigated to the Sign In page
    Then close the browser

 Scenario: Verify cart icon visibility and item count

    Then I should see a shopping cart icon
    And the cart icon should display the correct number of items in my cart
    Then close the browser
    
Scenario: Verify category links presence and navigation

    Then I should see category links such as "Electronics", "Clothing", "Home", "Toys"
    When I click on the "Electronics" category link
    Then I should be navigated to the Electronics category page
    Then close the browser
    
Scenario: Verify featured products display

    Then I should see a featured products section
    And it should contain product images, names, and prices
    Then close the browser
    
Scenario: Verify Deals of the Day presence and details

    Then I should see a Deals of the Day section
    And each deal should show the product name, discounted price, and original price
    Then close the browser
    
Scenario: Verify footer navigation links

    Then I should see footer links such as "Contact Us", "Privacy Policy", "Terms of Use"
    When I click the "Contact Us" link
    Then I should be navigated to the Contact Us page
    Then close the browser
 
Scenario: Verify location selector presence and functionality

    Then I should see a location or store selector option
    When I select a store location
    Then the page should update with relevant store information   
    Then close the browser              
