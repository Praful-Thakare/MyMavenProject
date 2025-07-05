package dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Base.BaseClass;
import pages.HomePage;

public class DropdownTest extends BaseClass{

	@Test
	public void testSelectOptions() {
		String option="Option 1";
    var   dropdownpage= homePage.Clickdropdown();
                                         dropdownpage.SelectfromDropdown(option);
                                       var selectedoptions=  dropdownpage.getSelectedOptions();
               assertEquals(selectedoptions.size(), 1,"Wrong number of options selected");
               
               assertTrue(selectedoptions.contains(option),"incorrected optin selected");
	}
}
