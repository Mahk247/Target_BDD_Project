package com.target.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.target.base.Browser;
import com.target.utils.Utility;

public class Homepage_Test extends Browser{
	WebDriver dr=Browser.openBrowser("chrome");
	Homepage hp=new Homepage(dr);
	@Test
	public void verifyHomepage() {
		String Expected = dr.getTitle();
		String ahpt="Target : Expect More. Pay Less.";
		Utility.verify(Expected, ahpt);
		
	}
}
