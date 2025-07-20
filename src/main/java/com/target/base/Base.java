package com.target.base;

import org.openqa.selenium.WebDriver;

public class Base {
	private static WebDriver dr;

	public static void initBrowser(String browserName) {
		dr = Browser.OpenBrowser(browserName);
		dr.get("https://www.target.com/");
	}

	public static WebDriver getDriver() {
		return dr;
	}

	public static void quitDriver() {
		if (dr != null) {
			dr.quit();
			dr = null;
		}
	}

}