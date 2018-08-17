package com.alphonso.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.alphonso.pages.AssetInformationPage;
import com.alphonso.pages.AssetSearchPage;
import com.alphonso.pages.MdmsPage;

public class  ExcelData extends BaseTest  {
	 static AssetSearchPage asp = new AssetSearchPage(driver);
	 static AssetInformationPage assetinfo = new AssetInformationPage(driver);
	 static MdmsPage Mdp = new MdmsPage(driver);
	 static XSSFWorkbook wbook ;
	 static XSSFSheet sheet;
	 static int lastrow;
	 static File file;
	 static FileInputStream fis;
	 
	public static void assetSearch() throws IOException, InterruptedException  
	{	
		System.out.println("bbbbbbbbbb"); 	
		asp.clickOnSearch();
	    file = new File("D:\\ProjectManagement\\Alphonso1\\Data\\input.xlsx" );
	    fis = new FileInputStream(file);
	    wbook = new XSSFWorkbook(fis);
	    sheet = wbook.getSheet("Asset");
	    lastrow = sheet.getLastRowNum();
		} 
	}  
	
