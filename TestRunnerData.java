package com.runnerdata;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\eclipse-workspace\\Maven_Cucumber_Project\\src\\test\\java\\com\\featuredata" , 
                 glue = "com.stepdefinitiondata" , monochrome = true , dryRun = true , tags = ("@Login,@Search,@Continue,@Booking"), 
                 plugin = {"html:Reports/CucumberData.html" })
                 
public class TestRunnerData {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		driver =  BaseClass.launchingBrowser("Chrome");

	}
	
	@AfterClass
	public static void tearDown() {

		BaseClass.closeTab();
	}
	
	
	

}
