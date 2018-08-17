package com.alphonso.generic;

import java.util.Iterator;

import org.testng.annotations.Test;

import com.alphonso.pages.MdmsPage;

public class MdmsLogic extends BaseTest
{
	
    public static void RunMdms() throws InterruptedException
    {
    MdmsPage mp = new MdmsPage(driver);
    mp.clickModule();
    
   //mp.clickOfferManagement();
   // mp.SelectSearchFields();   
    }
    
    }

