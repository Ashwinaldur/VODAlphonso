package com.alphonso.generic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Alert;



public class RunLogic extends ExcelData
	{
	     static List<String> al = new ArrayList<String>();
         static int count = 0;
	public static void Runcodelogic() throws InterruptedException, IOException
	{
			for(int i=1;i<=lastrow;i++)	
			
	  {
				try
				{		
			//Takes headend information from the sheet
			XSSFRow Row = sheet.getRow(i);
		
		    String Headend = Row.getCell(0).getStringCellValue();
		    asp.enterHeadend(Headend);
		
		    //Takes PAID information from the sheet
		    String paidID = Row.getCell(1).getStringCellValue();
		    asp.enterPaid(paidID);
		    
		    asp.clickOnAssetSearch(); 
		    asp.ScrollDown();
		    
		    //checks whether asset is PAID is present in Alphonso
		    boolean present = asp.checkActive();
		    System.out.println(present);
		    
		    //if asset is present it checks all the metadata information
		    if(present==true)
		    {    
		   	     al.add(paidID);
		   	     count = count+1;
		   	     
		    	//writes asset is present in excel
		    	asp.clickOnInfo();
		    	 sheet.getRow(i).createCell(2).setCellValue("Asset is Present");
		    	 FileOutputStream fout=new FileOutputStream(file);
		    	 wbook.write(fout);
		    	 asp.clickOnInfo();
		    	 Thread.sleep(2000);
		    	  
		    	 //writes asset title in the excel
		    	 String assetTitle = assetinfo.getText();
		    	 sheet.getRow(i).createCell(3).setCellValue(assetTitle);
		    	 FileOutputStream fout1=new FileOutputStream(file);
		    	 wbook.write(fout1);
		    	 
		    	 //writes assets path in the excel
		    	 String assetpath = assetinfo.getPath();
		    	 sheet.getRow(i).createCell(4).setCellValue(assetpath);
		    	 FileOutputStream fout2=new FileOutputStream(file);
		    	 wbook.write(fout2);
		    	 Thread.sleep(2000);
		    	 
		    	 //writes asset license start date in the excel
		    	 String assetStartDate = assetinfo.getStartDate();
		    	 int datelen = assetStartDate.length();
		    	 String StartDate = assetStartDate.substring(0, datelen-15);
		    	 sheet.getRow(i).createCell(5).setCellValue(StartDate);
		    	 FileOutputStream fout3=new FileOutputStream(file);
		    	 wbook.write(fout3);
		    	 
		    	 //writes asset license end date in the excel
		    	 String assetEndDate = assetinfo.getLastDate();
		    	 int datelen1 = assetEndDate.length();
		    	 String EndDate = assetEndDate.substring(0, datelen1-15);
		    	 sheet.getRow(i).createCell(6).setCellValue(EndDate);
		    	 FileOutputStream fout4=new FileOutputStream(file);
		    	 wbook.write(fout4);
		    	 
		    	 driver.navigate().back();
		    	 Thread.sleep(2000);
		    	
		    }
		    else
		    {
		    	//if the asset is not present writes asset not present
		    	sheet.getRow(i).createCell(2).setCellValue("Asset is not Present");
		    	FileOutputStream fout=new FileOutputStream(file);
		    	wbook.write(fout);
		    }
		   
		    //Removes the current headend and paid and checks for another asset
		    asp.RemoveHeadend();
		    Thread.sleep(1000);
		    asp.RemovePaid();
		    Thread.sleep(1000);
		  
	  }
	catch(Exception e)
				{
		
				}
	}
			
			System.out.println(al);
			System.out.println("The number of active assets = "+count);
	}
	
	
	 	
	}	
	


	
		 	 
	


