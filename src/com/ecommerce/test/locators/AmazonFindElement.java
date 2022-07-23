package com.ecommerce.test.locators;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFindElement {

	WebDriver driver;
	String site_url = "https://www.amazon.in/";
	
	@Before
	public void setUp() throws Exception {
		
		//Set selenium properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvaprakash\\eclipse-workspace\\Phase1-Selenium-Webdriver\\driver\\chromedriver.exe");
		
		//Instantiating driver
		
		driver = new ChromeDriver();
		driver.get(site_url);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void searchBoxTest() {
		//Get element bu ID
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("Search Tag name : "+searchBox.getTagName());
		Assert.assertEquals("input", searchBox.getTagName());
		
//		//Get element by class
//		WebElement searchBox2 = driver.findElement(By.className("nav-input nav-progressive-attribute"));
//		System.out.println("Search2 Tag name: "+searchBox2.getTagName());
		
		//Get element by name
		WebElement searchBox3 = driver.findElement(By.name("field-keywords"));
		System.out.println("Search3 Tag name : " +searchBox3.getTagName());
		
//		//Get element with tag name
//		
//		WebElement searchBox4 = driver.findElement(By.tagName("input"));
//		System.out.println("Search4 Tag name: "+searchBox4.getLocation());
//		
		//Get element by CSS selector
		
		WebElement searchBox5 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		System.out.println("Search5 Tag name : "+searchBox5.getTagName());
		
		WebElement searchBox5a = driver.findElement(By.cssSelector("input[class='nav-input nav-progressive-attribute']"));
		System.out.println("Search5a Tag name : "+searchBox5a.getTagName());
		
		//Get Element by xpath
		
		WebElement searchBox6 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		System.out.println("Search6 Tag name : "+searchBox6.getTagName());
	}

}
