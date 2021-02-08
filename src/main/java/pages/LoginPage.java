package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class LoginPage extends Page {

//	WebDriver driver;

	public ZohoAppPage doLogin(String username, String password) {

		type("email_ID",username);
		click("button1_ID");
		type("password_ID",password);
		click("button2_ID");
		
		return new ZohoAppPage();
	}

	public void goToSalesandMarketing() {

	}

	public void goToFinance() {

	}

}
