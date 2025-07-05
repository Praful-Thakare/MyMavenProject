package Navigation;

import org.testng.annotations.Test;

import Base.BaseClass;

public class Navigation_test extends BaseClass{

	@Test
	public void test_Navigation() {
		
		homePage.Clickdropdown();
		getWindowManager().goBack();
		getWindowManager().goForward();
		getWindowManager().refreshPage();
		getWindowManager().goTo("https://google.com");
       }
	
	@Test
	public void test_SwitchTab() {
		homePage.clickMultipleWindows().ClickHere();
		getWindowManager().SwitchToTab("New Window");
		}
}
	
	
