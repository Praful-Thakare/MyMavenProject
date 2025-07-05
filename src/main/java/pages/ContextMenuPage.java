package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
private WebDriver driver;
private By contextBox=By.xpath("//div[@id=\"hot-spot\"]");

public ContextMenuPage(WebDriver driver){this.driver=driver;}

public void RightClickOnBox() {

	WebElement box=driver.findElement(contextBox);

  Actions actions=new Actions(driver);
  actions.contextClick(box).build().perform();

}
public String GetTextFromAlert() {
	return driver.switchTo().alert().getText();
}
public void Accept_AlertPopup() {
	driver.switchTo().alert().accept();
}


}
