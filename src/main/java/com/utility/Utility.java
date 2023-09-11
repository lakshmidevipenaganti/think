package com.utility;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.openqa.selenium.TakesScreenshot;



public class Utility extends Config{
	public static ExtentReports report = ExtentReporterManager.getReportInstance();
	public static ExtentTest logger;

    

	static ConfigReader configReader = new ConfigReader();
	static Properties prop = configReader.init_prop();
	
	public static WebDriver launchingBrowser() {
		
		String browser = prop.getProperty("Browser");
		
		switch (browser) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			break;
	    default:
			System.out.println("Browser is not supported");
		}
		return driver;
		

	}

	public static void browserMaximize() {
		driver.manage().window().maximize();
	}


	public static void pageLoad() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
		
	}

	public static void launchingApp() {
		driver.get(prop.getProperty("url"));
	}

	public static void closingBrowser() {
		driver.quit();
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	public static void WindowHandle() {
		 String mainWindowHandle = driver.getWindowHandle();
	     Set<String> handles = driver.getWindowHandles();
	     Iterator<String> it = handles.iterator();
	     String parentpage = (String) it.next();
	     String childpage = (String) it.next();
	     driver.switchTo().window(childpage);
	}
	
	public static String getDate() {

        // TODO Auto-generated method stub

        Date date = new Date();

 

        return date.toString().replaceAll(":", "-").replaceAll(" ", "_");
		}

    	public void captureScreenshotOnFailure() throws IOException {
    	//Make sure screenshots folder is already created at the project level
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File binaryFile = ts.getScreenshotAs(OutputType.FILE);
    	String customizedFilePath = screenshotsPath + getDate() + ".png";
    	File imageFile = new File(customizedFilePath);
    	FileUtils.copyFile(binaryFile, imageFile);
    	//Extent Report Method
    	logger.addScreenCaptureFromPath(customizedFilePath);
      }

}
