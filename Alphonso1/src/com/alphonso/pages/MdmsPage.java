package com.alphonso.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.alphonso.generic.BaseTest;

	public class MdmsPage extends BaseTest{
	
		
	@FindBy(xpath="//span[@class='dropdown']")
	private WebElement Modules;
	
		
	@FindBy(xpath = "//a[.='Offer Management']")
	private WebElement OfferManagement;
	
	@FindBy(xpath = "//select[@id='offer_query_offer_query_criteria_attributes_0_key']")
	private WebElement OfferQuery1;

	
	//@FindBy(xpath = "//select[@id='offer_query_offer_query_criteria_attributes_0_operator']")
	//private WebElement OfferQuery2;
	
	@FindBy(xpath = "//input[@id='offer_query_offer_query_criteria_attributes_0_value']")
	private WebElement OfferQuery3;
	
	@FindBy(xpath="//input[@class='small button']/..//input[@value='Search']")
	private WebElement SearchButton;
	
	@FindBy(xpath="//div[@class='active icon']")
	private WebElement MDMSActive;
	
	@FindBy(xpath="//div[@class='active icon']")
	private WebElement MDMSActiveButton;
	
	
		
	public  MdmsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickModule() throws InterruptedException
	{
	Thread.sleep(2000);
	System.out.println("enters click module");
	Modules.click();
		}
	public void clickOfferManagement()
	{
		OfferManagement.click();
	}
	
	public void SelectSearchFields() throws InterruptedException
	{   		
	 	
	    Select sel1 = new Select(OfferQuery1);
	    System.out.println("Select option Enabled");
	    sel1.selectByVisibleText("URI");
	}
	
	
	

}
