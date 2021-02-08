package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;
import crm.CRMHomePage;

public class ZohoAppPage extends Page {

//	WebDriver driver;

	public void goToBooks() {

		click("booklink_CSS");
			
	}

	public void goToCalander() {

		click("calanderlink_CSS");
				
	}

	public CRMHomePage goToCRM() {

		click("crmlink_CSS");
				
		
		return new CRMHomePage();

	}

}
