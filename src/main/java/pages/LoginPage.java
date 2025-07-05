package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	private By usernameField=  By.xpath("//input[@id='username']");
	private By passwordField= By.xpath("//input[@id='password']");
	private By loginFeildBy= By.xpath("//form//button");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void Set_username(String username) {
		
		driver.findElement(usernameField).sendKeys(username);
		
	}
	
	public void Set_password(String password) {
		
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public SecureAreaPage clickOnLogin_btn() {
		driver.findElement(loginFeildBy).click();
			
		return new SecureAreaPage(driver);
	}
	
	
	
	
	
	
}
