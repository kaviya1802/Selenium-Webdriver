package com.ecommerce.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomeJunitTest {

	WebDriver driver;
	String site_Url = "https://www.amazon.in/";
	
	@Before
	public void setUpDriver() throws Exception {
		
		//1. Set selenium properties
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvaprakash\\eclipse-workspace\\Phase1-Selenium-Webdriver\\driver\\chromedriver.exe");
		
		//2. Instantiating webdriver
		
		driver = new ChromeDriver();
		driver.get(site_Url);
	}

	@After
	public void closeDriver() throws Exception {
		driver.close();
	}

	@Test
	public void testTitle() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test
	public void testUrl() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(site_Url, actualUrl);
	}
	
	@Test
	public void testMobileLink() {
		//Verify mobile link
		String expected_link = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		WebElement mobile_link = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		mobile_link.click();
		
		String actual_link = driver.getTitle();
		Assert.assertEquals(expected_link, actual_link);	
	}
	
	@Test
	public void searchOption() throws InterruptedException {
		//find search box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		//add input in search fields
		searchBox.sendKeys("iphone 11 pro max");
		Thread.sleep(2000);
		
		//click search
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		
		String expectedTitle = "Amazon.in : iphone 11 pro max";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
}
