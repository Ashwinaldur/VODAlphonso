package com.alphonso.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.alphonso.pages.LoginPage;
import com.alphonso.pages.LoginPage2;

public class MdmsLogin implements AutoConstant
{
	 public static  WebDriver driver ;

			@BeforeMethod
			public static void precondition() throws InterruptedException
			{   
			System.setProperty(gecko_key, gecko_value);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://172.30.83.16:8300/operators/sign_in");
			String username2 = "seperftest@charter.com";
			String password2 = "charterqa";
			LoginPage2 lp2 = new LoginPage2(driver);
			lp2.enterUsername(username2);
			lp2.enterPassword(password2);
			lp2.clickLogin();
		}
		
		@AfterMethod
		public static void postcondition()
		
		{
			driver.close();
		}
	 }


	

