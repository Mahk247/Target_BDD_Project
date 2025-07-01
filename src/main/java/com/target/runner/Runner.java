package com.target.runner;

import org.openqa.selenium.By;
import com.target.base.Browser;

public class Runner extends Browser{
	public static void main(String[] args) throws InterruptedException{
		
		Browser.openBrowser("chrome");
		//Type in Search box
		dr.findElement(By.xpath("//input[@id='search']")).sendKeys("Wireless Mouse");
		//Click on Search
		dr.findElement(By.xpath("//button[@aria-label='search']")).click();
		//Click on First Item
		dr.findElement(By.xpath("//*[@id=\'pageBodyContainer\']/div/div[1]/div/div/div[4]/div/div[6]/div[2]/div[1]/div/div/div[1]/h3/div/div/a/div[1]/picture/img")).click();
		//Click on Add to cart
		dr.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")).click();
		//Decline insurance
		dr.findElement(By.xpath("/html/body/div[21]/div/div/div[2]/div[3]/div[2]/button[2]")).click();
		Thread.sleep(3000);
		dr.close();
	}
}
