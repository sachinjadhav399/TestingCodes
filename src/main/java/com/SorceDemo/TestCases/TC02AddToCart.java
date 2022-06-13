package com.SorceDemo.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.SauceDemoHomePage;
import com.SorceDemo.utility01.ScreenShot;

public class TC02AddToCart extends TestBaseClass

{
	
	
	@Test
	
		
	
	public void singleProductAdd() throws InterruptedException, IOException
	{
		
			 
		SauceDemoHomePage hp = new SauceDemoHomePage(driver);
		
		hp.cart();
		Thread.sleep(3000);
		ScreenShot.takeScreenShot(driver);
		
		
	}
	
	
	
}