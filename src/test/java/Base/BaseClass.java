package Base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;
import utils.MyListener;
import utils.WindowManager;

public class BaseClass {

	WebDriver driver1;
	WebDriver driver;
	protected HomePage homePage;
	
	@BeforeClass
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\MyMavenProject\\Resources\\chromedriver.exe");
		driver1=new ChromeDriver(getChromeOptions());
		MyListener listener=new MyListener();
	driver=new EventFiringDecorator<>(listener).decorate(driver1);
		
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		
		homePage=new HomePage(driver);
	
	       }
	
	@BeforeMethod
	public void Launch_URL() {
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	     @AfterClass
	       public void tearDown() {
		    driver.quit();
	       }
	     
//	     //This method only takes Screenshot if Test case got failed.
//	     @AfterMethod
//	     public void recordFailure(ITestResult result) {
//    	 var camera= (TakesScreenshot)driver;
//	   if(ITestResult.FAILURE==result.getStatus()) {
//	    File	screenshot=camera.getScreenshotAs(OutputType.FILE);
//	    Path source = screenshot.toPath();
//	    Path destination = Paths.get("C:\\Users\\hp\\eclipse-workspace\\MyMavenProject\\Resources\\ScreenShot\\"+result.getName()+".png");
//	   try {
//		   Files.move(source,destination);
//	} catch (IOException e) {
//		e.printStackTrace();
//	} 
//	   }
//	    	 
//	     }
	     
	     // Taking ScreenShot after every test method
	     @AfterMethod
	     public void takeScreenshot(ITestResult result) {
	    	var camera= (TakesScreenshot)driver;
	    	File screenshot=camera.getScreenshotAs(OutputType.FILE);
	    	try {
	    		Path source = screenshot.toPath();
	    		Path destination = Paths.get("C:\\Users\\hp\\eclipse-workspace\\MyMavenProject\\Resources\\ScreenShot\\"+result.getName()+".png");
	    		Files.move(source, destination);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	
	     }
	     
	     //it just giving the driver for WindowManager which is located at BaseClass
	      public WindowManager  getWindowManager() {
	     	return new WindowManager(driver);
		
	}
	      //to use ChromeOptions which provide more functionality than Webdriver does.
	      public ChromeOptions getChromeOptions() {
			ChromeOptions options=new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			options.setExperimentalOption("useAutomationExtension", false);
			return options;
		}
	      
	
}
