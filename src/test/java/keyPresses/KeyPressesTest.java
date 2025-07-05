package keyPresses;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.BaseClass;

public class KeyPressesTest extends BaseClass{

	@Test
	public void testBackspace() {
		
	var	keypressespage=homePage.ClickOnKeyPresses();
	        keypressespage.enterText("A"+Keys.BACK_SPACE);
	     assertEquals(keypressespage.getResult(),"You entered: BACK_SPACE","Incorrect key enter");
	}
	
	@Test
	public void testEnterPie() {
		
	var	enterPie=homePage.ClickOnKeyPresses();
	        enterPie.EnterPie();
	
}}
