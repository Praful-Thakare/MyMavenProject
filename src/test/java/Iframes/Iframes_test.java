package Iframes;

import org.testng.annotations.Test;

import Base.BaseClass;

public class Iframes_test extends BaseClass{

	@Test
	public void test_Iframes() {
		var iframepage=homePage.CilckWYSIWYG();
		iframepage.CloseMessage();
	}
}
  