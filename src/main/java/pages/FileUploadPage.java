package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

	private WebDriver driver;
	private By inputField=By.id("file-upload");
	private By upload_btn=By.id("file-submit");
	private By textofUploadFile=By.id("uploaded-files");
	public FileUploadPage(WebDriver driver) { this.driver=driver;}
	
	public void ClickUploadBtn() {
		driver.findElement(upload_btn).click();
	}
	
	public void setInput(String absolutePathOfFile) {
		driver.findElement(inputField).sendKeys(absolutePathOfFile);
		ClickUploadBtn();
	}
	
	public String  getTextOfUploadFile() {
		return driver.findElement(textofUploadFile).getText();
	}
	
	
	
	
}
