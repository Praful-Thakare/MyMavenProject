package Contextmenu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Base.BaseClass;

public class Context_test extends BaseClass {

	@Test
	public void test_Context() {
	var	contextPage=homePage.ClickContextMenu();
	contextPage.RightClickOnBox();
	
	assertTrue(contextPage.GetTextFromAlert().contains("You selected a context menu"),"Incorrect Text");
	contextPage.Accept_AlertPopup();
	}
}
