package Base;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTheTextFromWeb {

	WebDriver driver;
	
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\MyMavenProject\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
	    WebElement ShiftingContentLink=driver.findElement(By.linkText("Shifting Content"));
	    ShiftingContentLink.click();
	    
	    WebElement MenuElement= driver.findElement(By.linkText("Example 1: Menu Element"));
	    MenuElement.click();
	    
	    List<WebElement> multiTexts= driver.findElements(By.xpath("//div[@id='content']//li"));
	    
	    for(WebElement multiText : multiTexts) {
	    	
	    	System.out.println(multiText.getText());
	    }
	    
	    driver.quit();
	    
	}
	public static void main(String[] args) {
		GettingTheTextFromWeb objFromWeb=new GettingTheTextFromWeb();
		objFromWeb.SetUp();
	}
}
