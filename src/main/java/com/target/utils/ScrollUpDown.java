package com.target.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUpDown {
	WebDriver dr;

	public void scrollToElement(WebDriver dr, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void scrollToElement(WebDriver dr, String element) {
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView(true);", dr.findElement(By.xpath(element)));

	}

	public void scrollDown(String masurement) throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) dr;
//		String masurement="window.scrollBy(0,850)";
		js.executeScript(masurement, "");
		Thread.sleep(2500);
	}

	public void scroolDown(String byElements) {
		JavascriptExecutor js = (JavascriptExecutor) dr;
//		WebElement fName=dr.findElement(By.xpath("//input[@id='fName']"));
		byElements = "arguments[0].scrollIntoView();";// set it for parameter
		js.executeScript(byElements, dr.findElement(By.xpath(byElements)));
	}

}
