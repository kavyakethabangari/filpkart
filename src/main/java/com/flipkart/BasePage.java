package com.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

protected WebDriver driver = null;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
		 public void explicitWait(WebElement webElement) {
			 WebDriverWait wait = new WebDriverWait(driver,5);
			 wait.until(ExpectedConditions.elementToBeClickable(webElement));
		 }

		
		
		
   
}
	

	


