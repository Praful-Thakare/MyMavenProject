 package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

	private WebDriver driver;
	private By FigureBox= By.className("figure");
	private By boxCaption=By.className("figcaption");
	
              public HoversPage(WebDriver driver) {
                       this.driver=driver;
              }
              
              public FigureCaptions HoverOverFigures(int index ) {
            	WebElement  figure   =  driver.findElements(FigureBox).get(index-1);
            	  Actions actions=new Actions(driver);
            	  actions.moveToElement(figure).perform();
				
            	  return new FigureCaptions(figure.findElement(boxCaption));
			 }
              

    public  class FigureCaptions{
    	 
    	 private WebElement caption;
    	 private By header= By.tagName("h5");
    	 private By Link=By.tagName("a");
    	 
    	     public FigureCaptions(WebElement caption) {
    		 this.caption=caption;
    		 }
    	     
    	     public boolean isCaptionDisplayed() {
				return caption.isDisplayed();
			}
    	     
    	     public String getTitle() {
    	    	 return caption.findElement(header).getText();
    	    	 }
    	     
    	    
			public String getLink() {
				return caption.findElement(Link).getAttribute("href");
    	    	 }
    	     
    	     public String  getLinkText() {
				return caption.findElement(Link).getText();
			}
    	     	     
     }
	
}
