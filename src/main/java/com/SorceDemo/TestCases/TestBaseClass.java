package com.SorceDemo.TestCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.SauceDemoLoginPage;

public class TestBaseClass 
{
	public WebDriver driver;
	

	@BeforeMethod
    public void setup() throws InterruptedException
    
	{
		
	
	System.setProperty ("webdriver.chrome.driver","./driver/chromedriver.exe");
	 
	  driver = new ChromeDriver();
	  System.out.println(" Chrome Browser is open");

	 driver.get("https://www.saucedemo.com/");
	 System.out.println("loging page is open ");
	 
	 driver.manage().window().maximize();
	 
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	 SauceDemoLoginPage lp = new SauceDemoLoginPage(driver);

	 
	    
	     lp.sendUserName();
	     Thread.sleep(3000);
		 
		 lp.sendUserPassword();
		 Thread.sleep(3000);
		 
		 lp.LoginButton();
		 Thread.sleep(3000);
}
	@AfterMethod
	public void closeTheBrowser()
	{
		

	driver.quit();
	System.out.println("end of program");
}
}