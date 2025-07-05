package FileUpload;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Base.BaseClass;
import pages.FileUploadPage;

public class FileUploadTest extends BaseClass{

	@Test
	public void testFileUpload() {
	FileUploadPage	fileuploadpage=homePage.ClickOnfileUpload();
	fileuploadpage.setInput("C:\\Users\\hp\\eclipse-workspace\\MyMavenProject\\Resources\\chromedriver.exe");
	
	assertTrue(fileuploadpage.getTextOfUploadFile().contains("chromedriver.exe"),"incorrect data");
	}
	
}
