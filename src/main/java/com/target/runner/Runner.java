package com.target.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import com.target.base.Browser;

public class Runner extends Browser{
	@Parameters({"browserName"})
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr;
				
		dr=Browser.OpenBrowser("chrome");
		
		dr.get("https://www.target.com/");

		dr.findElement(By.xpath("//input[@id='search']")).sendKeys("Wireless Mouse");

		dr.findElement(By.xpath("//button[@aria-label='search']")).click();

		Thread.sleep(3000);
		dr.close();
	}
}
