package com.alphonso.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.alphonso.generic.BaseTest;
import com.alphonso.generic.ExcelData;
import com.alphonso.generic.MdmsLogic;
import com.alphonso.generic.MdmsLogin;
import com.alphonso.generic.RunLogic;


 @Test
 public class SearchForAsset extends BaseTest
 {
	
	 public void alphonsoSearch() throws InterruptedException, IOException	 
	 {  	 
		 ExcelData.assetSearch();
	     RunLogic.Runcodelogic();
	     //MdmsLogin.precondition();
	    // MdmsLogic.RunMdms();
	   /* MdmsLogin.postcondition();*/	
	 
	 }
	 
	
	 }
 
 