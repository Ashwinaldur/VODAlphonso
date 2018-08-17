package com.alphonso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetInformationPage {
	@FindBy(xpath = "/html/body/div[1]/al-menu/ch-menu/div/section/al-vod-asset/ac-vod-asset/div[1]/div/div/div[2]/form/div[1]/div[1]/div/p")
	private WebElement actualtitle;
	
	@FindBy(xpath = "/html/body/div[1]/al-menu/ch-menu/div/section/al-vod-asset/ac-vod-asset/div[1]/div/div/div[2]/form/div[2]/div[2]/div/p")
	private WebElement path;
	
	@FindBy(xpath = "//label[.='License Window Start Date']/..//p[@class='form-control-static ng-pristine ng-untouched ng-valid ng-binding ng-not-empty']")
	private WebElement startdate;
	
	@FindBy(xpath = "//label[.='License Window End Date']/..//p[@class='form-control-static ng-pristine ng-untouched ng-valid ng-binding ng-not-empty']")
	private WebElement enddate;
	
	@FindBy(xpath = "//a[.='Properties']")
	private WebElement properties;
	
	@FindBy(xpath = "//input[@placeholder='Filter by property name']")
	private WebElement propertyname;
	
	@FindBy(xpath = "//span[@title='0']")
	private WebElement price;
	
	public  AssetInformationPage(WebDriver driver)
	{
	Super(driver);
		PageFactory.initElements(driver,this);
	}

	private void Super(WebDriver driver)
	{
		// TODO Auto-generated method stub	
	}	
	public String getText()
	{
		String assetTitle = actualtitle.getText();
		return assetTitle;
	}
	
	public String getPath()
	{
		String assetpath = path.getText();
		return assetpath;
	}
	
	public String getStartDate()
	{
		String assetStartdate = startdate.getText();
		return assetStartdate;
	}
	
	public String getLastDate()
	{
		String assetEnddate = enddate.getText();
		return assetEnddate;
	}
	
	public void clickProperties() throws InterruptedException{
		properties.click();
		AssetSearchPage.ScrollDown();
		Thread.sleep(2000);
		propertyname.sendKeys("price");
		Thread.sleep(2000);
		System.out.println(price.getText());
		
	}

	
}
