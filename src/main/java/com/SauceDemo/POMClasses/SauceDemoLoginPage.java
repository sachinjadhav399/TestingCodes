package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {

	
	
      private WebDriver driver;
      
      @FindBy(xpath="//input[@id='user-name']")
      private WebElement username;
      
      public void sendUserName()
      {
    	  username.sendKeys("standard_user");
    	  
      }
      
      @FindBy(xpath="//input[@id='password']")
      private WebElement password;
      
      public void sendUserPassword()
      {
    	  password.sendKeys("secret_sauce");
      }   
      
      @FindBy(xpath="//input[@id='login-button']")
      private WebElement loginbutton;
      
      public void LoginButton()
      {
    	  loginbutton.click();
      }   
	
      public SauceDemoLoginPage(WebDriver driver)
  	{
  		this.driver = driver;
  		
  		PageFactory.initElements(driver, this);

  	}



}


