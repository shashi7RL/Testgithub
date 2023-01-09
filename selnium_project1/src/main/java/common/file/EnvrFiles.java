package common.file;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class EnvrFiles {
	
 public WebDriver driver;
 

 static int Count=0;
 
 
 public void takeSceenshot() throws IOException {
		
	  TakesScreenshot Screenshot = (TakesScreenshot) driver;
	  File sourceFile = Screenshot.getScreenshotAs(OutputType.FILE);
	  File file = new File("./screenshotSelenium/myntra"+Count+".png");
	  FileUtils.copyFile(sourceFile,file);
	  Count++;
	
}
 
 public void openBrowser() {
	 
	 System.setProperty("webdriver.chrome.driver","C:/Users/SASIKUMAR R/eclipse-workspace/selnium_project1/Drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.myntra.com/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
 
 @BeforeSuite
 public void launcBrowser() {
	 
	 openBrowser();
	 
}
 
 @AfterSuite
 public void close() {
	 
	 driver.close();
	 
 }
 

}
