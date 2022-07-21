package com.ecommerce.test;

import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonHomePageTest {

	public static void main(String[] args) {
		// Amazon home page Test
		
		final String site_Url = "https://www.amazon.in/";
		
		//1. Set Selenium Properties
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvaprakash\\eclipse-workspace\\Phase1-Selenium-Webdriver\\driver\\chromedriver.exe");
		
		//2.  Instantiating Selenium Webdriver
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(site_Url);
		
		//3. Perform Test
		
		if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Test Passed !!!");
		}else {
			System.out.println("Test Failed !!!");
		}
		
		driver.close();

	}

}
