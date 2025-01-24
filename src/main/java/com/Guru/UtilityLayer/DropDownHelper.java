package com.Guru.UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {
	
	public static void handleDropDown(WebElement wb, String ExpValue)
	{
		  Select sel = new Select(wb);
		  sel.selectByVisibleText(ExpValue);
	}

}
