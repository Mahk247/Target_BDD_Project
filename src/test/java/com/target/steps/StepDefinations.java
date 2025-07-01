package com.target.steps;

import org.openqa.selenium.WebDriver;

import com.target.base.Browser;
import com.target.pages.Homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {
	WebDriver dr;
	Homepage hp;
	
	@Given("I launch the Target website with {string} browser")
	public void i_launch_the_Target_website_with_browser(String browser){
		dr=Browser.openBrowser(browser);
		hp=new Homepage(dr);

	}
	@When("I enter {string} into the search bar")
	public void i_enter_into_the_search_bar(String string) {
	    hp.search_box(string);
	}

	@When("I click the search button")
	public void i_click_the_search_button() {
		hp.enter_search_button();
	}
	
	@When("search results for {string} should be displyed")
	public void search_results_for_should_be_displyed(String string) {
		System.out.println("Target Homepage displayed");
	}
	@Then("close the browser")
	public void close_the_browser() {
	    dr.close();
	}
	
//	----------------------------------------------------------
	
	@When("I search for {string}")
	public void i_search_for(String string) {
		hp.search_box(string);
		hp.enter_search_button();
	}

	@When("I select the first product from the results")
	public void i_select_the_first_product_from_the_results(){
		hp.firstItemOnResult();
	}
	
	@Then("I select delivery method and add to the cart")
	public void i_select_delivery_method_and_add_to_the_cart() {
	   hp.select_delivery_method();
	   hp.addToCart();
	}
	
	@Then("the product should be successfully added to the cart")
	public void the_product_should_be_successfully_added_to_the_cart() {
	    System.out.println("The item is in the caer");
	}
	
//	----------------------------------------------------------------------

	@When("I navigate to the cart")
	public void i_navigate_to_the_cart() {
	   hp.clickOnCart();
	}

	@And("the cart should display the added product")
	public void the_cart_should_display_the_added_product() {
	    System.out.println("The card should be desplayed");
	}
	
//	----------------------------------------------------------------------
	
	@When("I click on account button")
	public void i_click_on_account_button() {
	
	}
	
	@And("I click on the sign-in or create account button")
	public void i_click_on_the_sign_in_or_create_account_button() {
	   
	}
	
	@When("I enter a valid {string} in the box")
	public void i_enter_a_valid_in_the_box(String string) {
	    
	}

	@When("I clicks on continue button")
	public void i_clicks_on_continue_button() {
	   
	}

	@Then("I click on signe in with password button")
	public void i_click_on_signe_in_with_password_button() {
	    
	}
	
	@Then("I should be logged into my account successfully")
	public void i_should_be_logged_into_my_account_successfully() {
	   System.out.println("I am in my Profile");
	}
//	==============================================================================-

	@Given("I am on the Target homepage with {string} browser")
	public void i_am_on_the_Target_homepage_with_browser(String browser) {
		dr=Browser.openBrowser(browser);
	}

	@Then("I should see navigation links {string}, {string}, {string}, {string}, {string}")
	public void i_should_see_navigation_links(String string, String string2, String string3, String string4, String string5) {
	   
	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) {
	   
	}

	@Then("I should be navigated to the Deals page")
	public void i_should_be_navigated_to_the_Deals_page() {
	    
	}

	@When("I enter {string} in the search bar")
	public void i_enter_in_the_search_bar(String string) {
	   
	}

	@When("I submit the search")
	public void i_submit_the_search() {
	  
	}

	@Then("I should see search results related to {string}")
	public void i_should_see_search_results_related_to(String string) {

	}

	@Then("I should see at least one promotional banner displayed")
	public void i_should_see_at_least_one_promotional_banner_displayed() {
	
	}

	@Then("the banner should contain an image and a clickable link")
	public void the_banner_should_contain_an_image_and_a_clickable_link() {
	  
	}

	@Then("I should see a {string} button")
	public void i_should_see_a_button(String string) {
	    
	}

	@When("I click the {string} button")
	public void i_click_the_button(String string) {
	    
	}

	@Then("I should be navigated to the Sign In page")
	public void i_should_be_navigated_to_the_Sign_In_page() {
	 
	}

	@Then("I should see a shopping cart icon")
	public void i_should_see_a_shopping_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the cart icon should display the correct number of items in my cart")
	public void the_cart_icon_should_display_the_correct_number_of_items_in_my_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should see category links such as {string}, {string}, {string}, {string}")
	public void i_should_see_category_links_such_as(String string, String string2, String string3, String string4) {
	 
	}

	@When("I click on the {string} category link")
	public void i_click_on_the_category_link(String string) {
	 
	}

	@Then("I should be navigated to the Electronics category page")
	public void i_should_be_navigated_to_the_Electronics_category_page() {

	}

	@Then("I should see a featured products section")
	public void i_should_see_a_featured_products_section() {
	    
	}

	@Then("it should contain product images, names, and prices")
	public void it_should_contain_product_images_names_and_prices() {
	    
	}

	@Then("I should see a Deals of the Day section")
	public void i_should_see_a_Deals_of_the_Day_section() {
	   
	}

	@Then("each deal should show the product name, discounted price, and original price")
	public void each_deal_should_show_the_product_name_discounted_price_and_original_price() {
	  
	}

	@Then("I should see footer links such as {string}, {string}, {string}")
	public void i_should_see_footer_links_such_as(String string, String string2, String string3) {
	
	}

	@When("I click the {string} link")
	public void i_click_the_link(String string) {
	    
	}

	@Then("I should be navigated to the Contact Us page")
	public void i_should_be_navigated_to_the_Contact_Us_page() {
	   
	}

	@Then("I should see a location or store selector option")
	public void i_should_see_a_location_or_store_selector_option() {
	    
	}

	@When("I select a store location")
	public void i_select_a_store_location() {
	   
	}

	@Then("the page should update with relevant store information")
	public void the_page_should_update_with_relevant_store_information() {
	    
	}
}