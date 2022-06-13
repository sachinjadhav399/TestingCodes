package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBasketValidation 
{
	 private WebDriver driver;

   @FindBy(xpath=("//*[@id=\"shopping_cart_container\"]/a"))
   private WebElement basket;
   
   public void basketCheck()
   {
	   basket.click();
   }
   public CheckBasketValidation(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);

	}
}
