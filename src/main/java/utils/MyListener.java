package utils;

import java.lang.reflect.Method;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.support.events.WebDriverListener;

public class MyListener implements WebDriverListener{

	
	
	@Override
	public void beforeClick(WebElement element) {
		
		System.out.println("[Before Click] : "+element.getText());
	}
	@Override
	public void afterClick(WebElement element) {
		
		System.out.println("[After Click]: "+element.getText());
	}
	
	}

