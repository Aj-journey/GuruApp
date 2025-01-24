package com.Guru.UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Guru.BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass{
	
	
	public static WebElement visibility(WebElement wb)
	{
		 WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(50));
		 
		 return wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public static void  senKeys(WebElement wb, String Value)
	{
		visibility(wb).sendKeys(Value);
	}
	
	public static void click(WebElement wb)
	{
		wb.click();
	}
			

}
