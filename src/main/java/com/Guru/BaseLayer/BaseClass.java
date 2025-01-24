package com.Guru.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.Guru.UtilityLayer.PropertiesClass;

public class BaseClass {

	protected static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return td.get();
	}

	public static void initialization(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriver driver = new ChromeDriver();
			 td.set(driver);

		}
		
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			WebDriver driver = new EdgeDriver();
			 td.set(driver);
		}
		
		else if(browserName.equalsIgnoreCase("incognito"))
		{
			 ChromeOptions opt = new ChromeOptions();
			 opt.addArguments("--incognito");
			WebDriver driver = new ChromeDriver(opt);
			td.set(driver);
		}
		
		else
		{
			System.out.println("User should enter valid BrowserName");
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		getDriver().get(PropertiesClass.getPropery("SIT_URL"));
	}

}
