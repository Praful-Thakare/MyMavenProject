package alert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.w3c.dom.Text;

import Base.BaseClass;

public class AlertTest  extends BaseClass{

	@Test
	public void test_AcceptAlert() {
		
		var alertpage=homePage.ClickonJSAlert();
		      alertpage.trigerrAlert();
		      alertpage.alert_clickToAccept();
		      assertEquals(alertpage.getResultText(),"You successfully clicked an alert","Accept Alert Text Incorrect");
		      }
	
	@Test
	public void test_DismissedAlert() {
		var triggeredismissed=homePage.ClickonJSAlert();
	          triggeredismissed.triggeredDismissedAlert();
	         String Text = triggeredismissed.getTextFromAlert();
	          triggeredismissed.click_ToDismissed();
	          assertEquals(Text, "I am a JS Confirm","Alert Text Is Incorrect");
	}
	
	@Test
	public void test_PromptAlert() {
		String text="TAU";
	var	alertPage=homePage.ClickonJSAlert();
	        alertPage.triggeredJSPromptAlert();
	        alertPage.Alert_setInput(text);
	        alertPage.Click_ToOk();
	        assertEquals(alertPage.getResultText(), "You entered: "+text,"Incorrect Alert Text");
	}
	
	
	
	
	
	
	
	
	
	
}
