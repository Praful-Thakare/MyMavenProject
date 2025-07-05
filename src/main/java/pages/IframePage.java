package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframePage {

	private WebDriver driver;
	private By closemessage=By.xpath("//button[@class=\"tox-notification__dismiss tox-button tox-button--naked tox-button--icon\"]");
	private By textArea=By.id("tinymce");
	private String id="mce_0_ifr";
	
	public IframePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void CloseMessage() {
		driver.findElement(closemessage).click();
	}
	
	public void clear_TextArea() {
		SwitchToIframe();
		driver.findElement(textArea).clear();
	}
	
	public void set_inputText(String text) {
		driver.findElement(textArea).sendKeys(text);
	}
	private void SwitchToIframe() {
		driver.switchTo().frame(id);
}
}