package com.asd.googletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	@Test
	public void searchInGoogle() {
		if(webdriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).isDisplayed()) {
			WebElement p = webdriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
					p.sendKeys("All Stack Developer Youtube");
			p.sendKeys(Keys.ENTER);
		} else {
			System.out.println("Google Search not found");
		}
	}

}
