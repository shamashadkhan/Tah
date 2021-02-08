package testcases;

import org.testng.annotations.AfterSuite;

import base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		Page.quit();
	}

}
