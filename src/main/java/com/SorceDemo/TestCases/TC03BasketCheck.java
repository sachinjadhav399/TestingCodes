package com.SorceDemo.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.CheckBasketValidation;
import com.SorceDemo.utility01.ScreenShot;

public class TC03BasketCheck extends TestBaseClass
{
   @Test 
   public void basketCheck() throws InterruptedException, IOException
   {
	   CheckBasketValidation cb = new CheckBasketValidation(driver);
	   cb.basketCheck();
	   Thread.sleep(3000);
		ScreenShot.takeScreenShot(driver);

   }
}
