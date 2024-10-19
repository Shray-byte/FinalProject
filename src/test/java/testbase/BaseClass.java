package testbase;

import java.time.Duration;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Properties;
import java.util.Date;
import java.io.File;

import java.io.FileReader;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;

import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.apache.logging.log4j.LogManager;//log4j2
import org.apache.logging.log4j.Logger;//log4j2
import org.openqa.selenium.TakesScreenshot;

public class BaseClass 
{
public static WebDriver driver;


	
  
		
		public static void scroll()
		{
			// Cast driver to JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll by 500 pixels down
	        js.executeScript("window.scrollBy(0, 500);");
		}
	
		
	
	
	public static String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath = System.getProperty("user.dir") + File.separator + "screenshots" 
                + File.separator + tname + "_" + timeStamp + ".png";
        File targetFile = new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}

}
