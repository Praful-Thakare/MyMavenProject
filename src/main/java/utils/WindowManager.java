package utils;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowManager {

	private WebDriver driver;
	private WebDriver.Navigation navigate;
	
	public WindowManager(WebDriver driver) {
		this.driver=driver;
		navigate=driver.navigate();
	}
	
	//Navigation methods
	
	public void goBack() {
		navigate.back(); 
	}
	
	public void goForward() {
		navigate.forward();
	}
	
	public void refreshPage() {
		navigate.refresh();
	}
	
	public void goTo(String url) {
		navigate.to(url);
	}
	
	//Switch to new tab
	
	public void SwitchToTab(String tabTitle) {
	Set<String>	windows=driver.getWindowHandles();
	
	System.out.println("numbers of windows present: "+windows.size());
	windows.forEach(System.out::println);
	
	for(var window : windows) {
		System.out.println("current window : "+window);
		driver.switchTo().window(window);
		System.out.println(driver.getTitle());
		
		if(tabTitle.equals(driver.getTitle())) {
			break;
		}
	}
	
	}
	
	
	
	
}
