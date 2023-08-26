package com.amazon.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass
{
	public static void impliciteWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public static void expliciteWait(WebDriver driver, int time,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		public static String  readConfigProp(String propName) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Automation_Assignment\\Confg.properties");
		prop.load(file);
		return prop.getProperty(propName);
	}
		public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
		{
			String a=System.getProperty("user.dir");
			String b="\\ExcelSheet\\amazontestdata.xlsx";
			 FileInputStream file=new FileInputStream(a+"/"+b);
			 String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
			 return value;	 	 
		}

		public static void JavaScriptExcutor(WebDriver driver,WebElement element)
		{
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);
		}

}
