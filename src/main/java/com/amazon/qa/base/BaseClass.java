package com.amazon.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class BaseClass 
{
//	public WebDriver driver;
	
	
	public void openApplication(WebDriver driver) throws InterruptedException
	{  

//		        if (browser.equalsIgnoreCase("edge")) {
//		            driver=new EdgeDriver();
//		        } else if (browser.equalsIgnoreCase("firefox")) {
//		            driver=new FirefoxDriver();
//		        }
		         
		    
		
		//driver=new ChromeDriver();
		driver.manage().window().maximize();  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
        driver.get("https://www.amazon.in/");
	          
}
	
}













//{
//	public static WebDriver driver;
//
//	public static void launchBrowser() throws IOException
//	{
//		String bName=Utility.readConfigProp("browserName");
//		if(bName.equalsIgnoreCase("chrome"))
//		{
//			Reporter.log("launching chromeBrowser", true);
//			 driver=new ChromeDriver();	
//		}
//
//		else if(bName.equalsIgnoreCase("firefox"))
//		{
//			Reporter.log("launching FireFoxBrowser", true);
//		     driver=new FirefoxDriver();
//		}
//		driver.manage().window().maximize();
//		driver.get(Utility.readConfigProp("url"));
//		Utility.impliciteWait(driver, 5);
//}
	
