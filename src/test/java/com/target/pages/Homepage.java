package com.target.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver dr;

	public Homepage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);

	}

	@FindBy(xpath = "//input[@id='search']")
	WebElement find_search_box;

	public void search_box(String string) {
		find_search_box.sendKeys(string);
	}

	@FindBy(xpath = "//button[@aria-label='search']")
	WebElement enter_search_button;

	public void enter_search_button() {
		enter_search_button.click();
	}

	@FindBy(xpath = "//*[@id=\"pageBodyContainer\"]/div/div[1]/div/div/div[4]/div/div[6]/div[2]/div[1]/div/div/div[1]/h3/div/div/a/div[1]")
	WebElement first_item_on_serch_result;

	public void firstItemOnResult() {
		first_item_on_serch_result.click();
	}
	
	@FindBy(xpath = "//button[@data-test='fulfillment-cell-pickup']")
	WebElement select_delivery_method_pickup;
	@FindBy(xpath = "//button[@data-test='fulfillment-cell-delivery']")
	WebElement select_delivery_method_delivery;
	@FindBy(xpath = "//button[@data-test='fulfillment-cell-shipping']")
	WebElement select_delivery_method_shipping;

	public void select_delivery_method() {
		select_delivery_method_pickup.click();
		select_delivery_method_delivery.click();
		select_delivery_method_shipping.click();
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")
	WebElement add_to_cart_button;
	@FindBy(xpath = "//button[@aria-label='close']")
	WebElement close_popup;

	public void addToCart() {
		add_to_cart_button.click();
		close_popup.click();
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[5]/div[1]/*[name()='svg'][1]")
	WebElement click_on_shopping_cart;
	
	public void clickOnCart() {
		click_on_shopping_cart.click();
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[4]/span[1]")
	WebElement click_on_Account;
	
	public void clickOnAccount() {
		click_on_Account.click();
	}
	
	@FindBy(xpath = "/html/body/div[9]/div/div/div[2]/ul/div/button")
	WebElement click_on_signin_and_Account_button;
	
	public void ClickOnSignInButton() {
		click_on_signin_and_Account_button.click();
	}
	
	@FindBy(xpath = "/html/body/div[9]/div/div/div[2]/ul/div/button")
	WebElement enter_a_valid_email_in_box;
	
	public void enter_email() {
		enter_a_valid_email_in_box.sendKeys("mahk09@yahoo.com");
	}
}
