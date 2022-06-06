package com.asd.googletest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver webdriver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chromedriver.exe");
		webdriver = new ChromeDriver();
	}
	
	@BeforeTest
	public void openGoogle() {
		webdriver.get("https://www.google.com");
		webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown() {
		webdriver.quit();
	}
}
