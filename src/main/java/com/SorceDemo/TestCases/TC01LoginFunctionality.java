package com.SorceDemo.TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.SauceDemoLoginPage;
import com.SorceDemo.utility01.ScreenShot;

public class TC01LoginFunctionality extends TestBaseClass

{
	
	@Test
	public static void add() throws IOException
	{
		 WebDriver driver;
	
	System.setProperty ("webdriver.chrome.driver","E:\\chromedriver.exe");
	 
	  driver = new ChromeDriver();
	  System.out.println(" Chrome Browser is open");

	 driver.get("https://www.saucedemo.com/");
	 System.out.println("loging page is open ");
	 
	 driver.manage().window().maximize();
	 
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 SauceDemoLoginPage lp = new SauceDemoLoginPage(driver);
	 ScreenShot.takeScreenShot(driver);
	  
	 
//	 lp.sendUserName();
//	 
//	 lp.sendUserPassword();
//	 
//	 lp.LoginButton();
	 
	 
	 
}
}