package Entry_Ad;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseClass;

public class EntryAd_test extends BaseClass{

	@Test
	public void test_EntryAd() {
	var entryadpage=	homePage.ClickEntryAD();
	entryadpage.Click_on_model_close();

	
	}
	
	
}
