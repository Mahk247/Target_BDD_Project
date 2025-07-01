package com.target.utils;

import java.io.File;
import java.util.Calendar;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.target.base.Browser;

public class Utility {
	static WebDriver dr;
	private static Logger log = Utility.getLog(Browser.class);

	public static void verify(String expected, String actual) {
		if (expected.equalsIgnoreCase(actual)) {
			log.info("Test Passed");
		} else {
			log.info("Test Failed");
			log.info("Actual result is: " + actual);
			log.info("Expected result is : " + expected);
			Assert.assertEquals(expected, actual);
		}
	}

	public WebDriver switchScreen() {
		String sc1 = dr.getWindowHandle();
		Set<String> sc2 = dr.getWindowHandles();
		for (String sc : sc2) {
			if (!sc.equals(sc1)) {
				dr.switchTo().window(sc);
			}
		}
		return dr;
	}

	public static Logger getLog(Class clazz) {
		Logger log = Logger.getLogger(clazz);
		PropertyConfigurator.configure("src\\main\\resources\\properties\\log4j.properties");
		return log;
	}

	public static void takeScreensShot(WebDriver dr, String fileName) {

		try {
			Calendar calendar = Calendar.getInstance();
			long time = calendar.getTimeInMillis();
			TakesScreenshot scrShot = ((TakesScreenshot) dr);
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File desFile = new File("target/Screenshot/" + fileName + "_" + time + ".jpeg");
			FileUtils.copyFile(srcFile, desFile);
		} catch (Exception e) {
			log.info(e.getMessage());
		}

	}

}
