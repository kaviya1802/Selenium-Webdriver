package com.ecommerce.github;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLoginTest {
	
	WebDriver driver;
	
	String site_Url = "https://github.com/login";

	@Before
	public void setUpDriver() throws Exception {
		//Set Selenium Properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selvaprakash\\eclipse-workspace\\Phase1-Selenium-Webdriver\\driver\\chromedriver.exe");
		
		//Instantiting driver
		
		driver = new ChromeDriver();
		driver.get(site_Url);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void gitHubInvalidLoginTest() {
	
		WebElement userName = driver.findElement(By.id("login_field"));
		userName.sendKeys("kaviyakaviya182@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Nkavya@18");
		
		WebElement submit = driver.findElement(By.cssSelector("#login > div.auth-form-body.mt-3 > form > div > input.btn.btn-primary.btn-block.js-sign-in-button"));
		submit.click();
		
		WebElement error = driver.findElement(By.cssSelector("#js-flash-container > div > div"));
		Assert.assertEquals("Incorrect username or password.", error.getText());
			
	}
	
	@Test
	public void gitHubNoInputLoginTest() {
	
		WebElement userName = driver.findElement(By.id("login_field"));
		userName.sendKeys("kaviyakaviya182@gmail.com");
		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("Nkavya@18");
		
		WebElement submit = driver.findElement(By.cssSelector("#login > div.auth-form-body.mt-3 > form > div > input.btn.btn-primary.btn-block.js-sign-in-button"));
		submit.click();
		
		WebElement error = driver.findElement(By.cssSelector("#js-flash-container > div > div"));
		Assert.assertEquals("Incorrect username or password.", error.getText());
			
	}
	
	@Test
	public void gitHubLoginTest() {
		
		Credentials cred = new Credentials();
		
		WebElement userName = driver.findElement(By.id("login_field"));
		userName.sendKeys(cred.userName);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(cred.password);
		
		WebElement submit = driver.findElement(By.cssSelector("#login > div.auth-form-body.mt-3 > form > div > input.btn.btn-primary.btn-block.js-sign-in-button"));
		submit.click();
		
//		WebElement repo = driver.findElement(By.cssSelector("body > div.application-main > div > aside > div > div.mb-3.Details.js-repos-container.mt-5 > div > h2 > a"));
//		Assert.assertEquals("New", repo.getText());
			
	}

}
