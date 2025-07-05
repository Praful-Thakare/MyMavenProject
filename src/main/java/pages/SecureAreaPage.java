package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

	private WebDriver driver;
	private By BannerTextFeild= By.xpath("//div[@id='flash']");
	
	public SecureAreaPage(WebDriver driver) {
		this.driver=driver;
		}
	
	public String GetBannerText() {
		
		return driver.findElement(BannerTextFeild).getText();
		
	}
	
}
