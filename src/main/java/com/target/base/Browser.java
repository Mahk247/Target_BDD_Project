package com.target.base;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.target.utils.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	private static Logger log = Utility.getLog(Browser.class);
	public static HashMap<String, WebDriver> hm = new HashMap<String, WebDriver>();
	public static WebDriver dr;

	public static WebDriver openBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver();
			log.info("Chrome is opening");
			hm.put("driver", dr);
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			dr = new FirefoxDriver();
			log.info("Firefox is opening");
			hm.put("driver", dr);
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			dr = new EdgeDriver();
			log.info("EDGE is opening");
			hm.put("driver", dr);
		} else {
			log.info("Enter supported browser name either chrome, firefox or edge");
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("https://www.target.com/");
		return dr;
	}
}
