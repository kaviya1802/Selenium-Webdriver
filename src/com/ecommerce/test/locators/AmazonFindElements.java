package com.ecommerce.test.locators;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFindElements {
	
	WebDriver driver;
	String site_Url = "https://www.amazon.in/";

	@Before
	public void setUpDriver() throws Exception {
		//set Selenium Properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvaprakash\\eclipse-workspace\\Phase1-Selenium-Webdriver\\driver\\chromedriver.exe");
		
		//Instantiating driver
		driver = new ChromeDriver();
		driver.get(site_Url);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void findElementsTest() {
		//to find multiple elements
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		for(WebElement elem :  elements) {
			System.out.println("Tag Name :"+elem.getTagName() +"\n Location : "+elem.getLocation());
			Assert.assertEquals("input", elem.getTagName());
		}
	}
	
	@Test
	public void findElementsTest2() {
		//to find multiple elements
		List<WebElement> elements = driver.findElements(By.tagName("script"));
		for(WebElement elem :  elements) {
			System.out.println("Tag Name :"+elem.getTagName() +"\n Location : "+elem.getLocation());
			Assert.assertEquals("script", elem.getTagName());
		}
	}

}
