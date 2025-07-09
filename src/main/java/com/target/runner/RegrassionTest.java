package com.target.runner;

import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Additional tag: "@smoke"
@CucumberOptions(features = { "src\\main\\java\\com\\target\\features" }, glue = "com.target.steps", tags = {
		"@regression" }, plugin = { "json:target/cucumber-reports/Cucumber.json", "pretty",
				"de.monochromata.cucumber.report.PrettyReports:target/cucumber", "html:target/pretty-cucumber" })

public class RegrassionTest extends AbstractTestNGCucumberTests {
	@BeforeSuite
	public void beforeSuite(String browser) {
		System.setProperty("browser", browser);
		System.out.println("Regression test suite began.....");
	}

	@AfterSuite
	public void afterSuite() {
//		EmailSender.emailSender();
		System.out.println("Email sent successfully with attachment.");
	}
}