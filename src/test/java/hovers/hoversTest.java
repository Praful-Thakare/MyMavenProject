package hovers;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.HoversPage;

public class hoversTest extends BaseClass {

	@Test
	public void testHoverUser1() {
		
	var hoverpage=	homePage.ClickHovers();
    var  caption =hoverpage.HoverOverFigures(1);
    
    assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
    assertEquals(caption.getTitle(),"name: user1","caption title incorrect");
    assertEquals(caption.getLinkText(),"View profile","Caption Link text incorrect");
    assertTrue(caption.getLink().endsWith("/users/1"), "Link is Incorrect");
    
	}
}
