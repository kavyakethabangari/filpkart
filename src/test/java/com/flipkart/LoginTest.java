package com.flipkart;

	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class LoginTest extends BaseTest {
	  
		private WebDriver  driver = null;
		private LoginPage loginpage = null ;
		
		@BeforeMethod
		public void initMethod() {
			this.driver = this.getWebDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			this.loginpage  = new LoginPage(driver);

		}

		@Test(priority = 1)
		public void loginToFlipkart() throws InterruptedException {
			this.loginpage.setMobileNumber("8790804261");
			this.loginpage.setPassword("Bangari@96");
			this.loginpage.clickOnLoginButton();
		
		this.loginpage.setSearchForProduct("poco m4 pro");
		this.loginpage.clickOnSearchButton();
		this.loginpage.clickOnBuyNowButton();
		
		
	}	
		
	
	@AfterMethod
	
	public void quitDriver() {
		driver.quit();

	}

	
	}
