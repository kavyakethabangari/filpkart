package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage { 
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	private WebElement txtBoxMobileNumber;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement txtBoxPassword;
	
	@FindBy(xpath="(//span[text()='Login'])[2]")
	private WebElement btnlogin;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement txtBoxSearchForProduct;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[1]")
	private WebElement btnSearch;
	
	@FindBy(xpath="//div[text()='POCO M4 Pro (Cool Blue, 64 GB)']")
	private WebElement lblMobilePOCOM4Pro;
	
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2U9uOA ihZ75k _3AWRsL\"]")
	private WebElement btnBuyNow;
	
	
	
	
	
public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);
}
	public void setMobileNumber(String mobilenumber) throws InterruptedException {
		Thread.sleep(3000);
	this.txtBoxMobileNumber.sendKeys(mobilenumber);
}
		public void setPassword(String password) throws InterruptedException {
			Thread.sleep(3000);
			this.txtBoxPassword.sendKeys(password);
		}
		
		public void clickOnLoginButton() {
			this.btnlogin.click();
		
			
		}
		public void setSearchForProduct (String mobile) throws InterruptedException {
			Thread.sleep(3000);
			this.txtBoxSearchForProduct.sendKeys(mobile);
		}
		public void clickOnSearchButton() throws InterruptedException {
			Thread.sleep(3000);
			
			
			this.btnSearch.click();
		}
		public String getMobilePocoM4Pro() {
			return this.lblMobilePOCOM4Pro.getText();
		}
		public void clickOnMobilePocoM4Pro() throws InterruptedException{
			Thread.sleep(3000);
			this.lblMobilePOCOM4Pro.click();
		}
		public void clickOnBuyNowButton() {
			this.btnBuyNow.click();
		}
		
		
		}
