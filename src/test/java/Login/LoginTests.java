package Login;

import Base.BaseClass;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class LoginTests extends BaseClass{

	@Test 
	public void testSucessfullLogin() {
		
	LoginPage	loginpage=homePage.ClickauthenticationForm();
	loginpage.Set_username("tomsmith");
	loginpage.Set_password("SuperSecretPassword!");
	SecureAreaPage securepagearea =loginpage.clickOnLogin_btn();
	assertTrue( securepagearea.GetBannerText().contains("You logged into a secure area!" ),"Alert text is incorrect");
	}
}
