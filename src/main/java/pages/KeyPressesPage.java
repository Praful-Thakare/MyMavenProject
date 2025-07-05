package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

	private WebDriver driver;
	private By InputField=By.id("target");
	private By ResultField=By.id("result");
	
	public KeyPressesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterText(String text) {
		driver.findElement(InputField).sendKeys(text);
	}
	
	public String getResult() {
	return	driver.findElement(ResultField).getText();
	}
	
	public void EnterPie() {
		enterText(Keys.chord(Keys.ALT,"227")+"=3.14");
	}
	
}
