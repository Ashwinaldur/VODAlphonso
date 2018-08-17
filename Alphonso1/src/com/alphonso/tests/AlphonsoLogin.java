package com.alphonso.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.alphonso.generic.BaseTest;
import com.alphonso.pages.LoginPage;

@Test
public class AlphonsoLogin extends BaseTest {
	
	public void alphonsoLogin() throws InterruptedException
	{
	WebDriver driver = null;
	LoginPage lp = new LoginPage(driver);
	driver.get("http://alphonso-stackc.engprod-charter.net/alphonso-web/#/login/");
	String username1 = "ecms-admin";
	String password1 = "welcome2018";
	lp.enterUsername(username1);
	lp.enterPassword(password1);
	lp.clickLogin();
}
}
