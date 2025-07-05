package pages;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

	  private WebDriver driver;
	  private By triggeredAlertButton=By.xpath("//button[text()='Click for JS Alert']");
	  private  By results=By.id("result");
	  private By triggeredConfitmBybutton=By.xpath("//button[text()='Click for JS Confirm']");
	  private By triggeredPromptButton=By.xpath("//button[text()='Click for JS Prompt']");
	  
	  
	  public AlertPage(WebDriver driver) {
		  this.driver=driver;
	  }
	  
	  
	  public void trigerrAlert() {
		driver.findElement(triggeredAlertButton).click();
	}
	  
	  public void alert_clickToAccept() {
		
		  driver.switchTo().alert().accept();
	}
	  
	  public void triggeredDismissedAlert() {
		driver.findElement(triggeredConfitmBybutton).click();
	}
	  public void click_ToDismissed() {
		driver.switchTo().alert().dismiss();
	}
	public String getTextFromAlert() {
		return driver.switchTo().alert().getText();
	}
	public void triggeredJSPromptAlert() {
		driver.findElement(triggeredPromptButton).click();
	}
	public void Alert_setInput(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public void Click_ToOk() {
		driver.switchTo().alert().accept();
	}
	  
	  public String getResultText() {
		  return driver.findElement(results).getText();
	  }
	  
	  
}
