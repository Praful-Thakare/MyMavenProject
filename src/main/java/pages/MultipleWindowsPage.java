package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

	private WebDriver driver;
	private By clickhere=By.xpath("//div[@id=\"content\"]//a");
	
	public MultipleWindowsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ClickHere() {
		driver.findElement(clickhere).click();
	}
}
