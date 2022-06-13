package com.SorceDemo.utility01;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	public static void takeScreenShot(WebDriver driver) throws IOException
	{
		
	
	//private WebDriver driver;
	
	TakesScreenshot ts = (TakesScreenshot)driver;

		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
	File DestFile = new File("./screenshot/Swaglab1.jpg");
		 
		FileHandler.copy(SourceFile,DestFile);
		System.out.println("Screen Shot taken ");
}
}
