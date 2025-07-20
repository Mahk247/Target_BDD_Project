package com.target.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.target.base.Base;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\main\\java\\com\\target\\features" }, glue = "com.target.steps", tags = {
		"@regression"}, plugin = { "json:target/cucumber-reports/Cucumber.json", "pretty",
				"de.monochromata.cucumber.report.PrettyReports:target/cucumber", "html:target/pretty-cucumber" })

public class RegrassionTest extends AbstractTestNGCucumberTests {
	WebDriver dr;

	@BeforeClass
	@Parameters({ "browserName" })
	public static void beforeclass(String browserName) {
		Base.initBrowser(browserName);
		System.out.println("Regression test suite began.....");
	}

	@AfterSuite
	public void closeBrowser() {
		Base.quitDriver();
		
	}
}