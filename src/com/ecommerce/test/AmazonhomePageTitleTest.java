package com.ecommerce.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonhomePageTitleTest {

	@Test
	public void testHomeTitle () {
		// Title test

			final String site_Url = "https://www.amazon.in/";
		
			//1 . Set selenium properties
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvaprakash\\eclipse-workspace\\Phase1-Selenium-Webdriver\\driver\\chromedriver.exe");
		
			//2.Instantiating driver
		
			WebDriver driver = new ChromeDriver();
		
			driver.get(site_Url);
		
		//3. performing test
		
			String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			String actualTitle = driver.getTitle();
		
			Assert.assertEquals(expectedTitle, actualTitle);
		
			driver.close();
	    }
	}
