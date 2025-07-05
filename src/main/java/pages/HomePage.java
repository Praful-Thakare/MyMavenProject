package pages;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public LoginPage ClickauthenticationForm() {
		
		ClickLink("Form Authentication");
		
		return new LoginPage(driver);
	}
	
	public DropDownPage Clickdropdown() {
		
		ClickLink("Dropdown");
		return new DropDownPage(driver);
	}
	
	public HoversPage ClickHovers() {
	ClickLink("Hovers");		
	
	return new HoversPage(driver);
	}
	
	public  KeyPressesPage ClickOnKeyPresses() {
		
		ClickLink("Key Presses");
		return new KeyPressesPage(driver);
	}
	
	public AlertPage ClickonJSAlert() {
		ClickLink("JavaScript Alerts");
		return new AlertPage(driver);
	}
	
	public FileUploadPage ClickOnfileUpload() {
		ClickLink("File Upload");
		return new FileUploadPage(driver);
	}
	
	public EntryAdPage ClickEntryAD() {
		ClickLink("Entry Ad");
		return new EntryAdPage(driver);
	}
	
	public ContextMenuPage ClickContextMenu() {
		ClickLink("Context Menu");
		return new ContextMenuPage(driver);
	}
	
	public IframePage CilckWYSIWYG () {
		ClickLink("WYSIWYG Editor");
		return new IframePage(driver);
	}
	
	public MultipleWindowsPage clickMultipleWindows() {
		ClickLink("Multiple Windows");
		return new MultipleWindowsPage(driver);
	}
	
		public void ClickLink(String LinkText) {
			
			driver.findElement(By.linkText(LinkText)).click();
			
			}
	
	
	
	
	
}
