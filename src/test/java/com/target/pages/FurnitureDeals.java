package com.target.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FurnitureDeals {
	WebDriver dr;

	public FurnitureDeals(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
}