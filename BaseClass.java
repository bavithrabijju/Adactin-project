package com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver launchingBrowser(String browsername) {
		
		if (browsername.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		
		else if (browsername.equalsIgnoreCase("firefox")) {
			
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();

		}
            return driver;
	}
	
	//GET
   public static void urlLaunch(String url) {
	driver.get(url);
}
   //CLOSE
   public static void closeTab() {
     driver.close();

}
  
   //QUIT
   public static void terminateBrowser(){
	  driver.quit(); 
   }
  
   //SENDKEYS
  public static void passInput(WebElement element,String input) {
	  element.sendKeys(input);
  }
  
   //CLICK
   public static void clickonElement(WebElement element) {
	   element.click();
   }
   
   //SELECTBYVALUE
   public static void selectValue(WebElement element,String value ) {
	   Select s = new Select(element);
	   s.selectByValue(value);
	}
   
   //SELECTBYINDEX
   public static void selectIndex(WebElement element,int value) {
	   Select s1 = new Select(element);
	   s1.selectByIndex(value);
  }
   
   //SELECTBYVISIBLETEXT
   public static void selectVisible(WebElement element,String value) {
	   Select s2 = new Select(element);
	   s2.selectByVisibleText(value);
   }
   
   //SCREENSHOT
   public static void screenShot(String location) throws IOException {
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File des = new File(location);
	 FileUtils.copyFile(src, des);
	 

}
   
   
   
   
   
}
