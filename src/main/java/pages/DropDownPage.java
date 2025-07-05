package pages;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

        private	WebDriver driver;
    	private By dropdown=By.id("dropdown");
	
    	public DropDownPage(WebDriver driver) {
    		
    		this.driver=driver;
    	}
	
	public void SelectfromDropdown(String option) {
		
		FindDropdown().selectByVisibleText(option);
		
	}
	
	public List< String> getSelectedOptions() {
	List<WebElement>	SelectedOptions=FindDropdown().getAllSelectedOptions();
		
		return SelectedOptions.stream().map(e-> e.getText()).collect(Collectors.toList());
	}
	
	private Select  FindDropdown() {
	
		return new Select(driver.findElement(dropdown));
		
	}
	
}
