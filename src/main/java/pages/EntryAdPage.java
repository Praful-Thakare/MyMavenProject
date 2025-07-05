package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
private WebDriver driver;
private By close_Model=By.xpath("//p[text()='Close']");

public EntryAdPage(WebDriver driver) {this.driver=driver;}

public void Click_on_model_close() {
	
	driver.switchTo().alert().dismiss();
}

}
