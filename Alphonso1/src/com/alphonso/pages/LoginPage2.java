package com.alphonso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	@FindBy(xpath = "//input[@id='operator_email']")
	private WebElement MdmsUser;
	
	@FindBy(xpath = "//input[@id='operator_password']")
	private WebElement MdmsPassword;
	
	@FindBy(xpath = "//input[@name='commit']")
	private WebElement MdmsSignIn;
	
	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username2) throws InterruptedException
	{
		MdmsUser.sendKeys(username2);
		Thread.sleep(2000);
	}
	public void enterPassword(String password2) throws InterruptedException
	{
		MdmsPassword.sendKeys(password2);
		Thread.sleep(2000);
	}
	public void clickLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		MdmsSignIn.click();
	}
	

}
