package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class HomePage extends Page {

//	WebDriver driver;

	public void goToSupport() {

		driver.findElement(By.cssSelector("a[class='zh-support']")).click();
	}

	public void goToSignUp() {

		driver.findElement(By.cssSelector("a[class='zh-signup']")).click();
	}

	public LoginPage goToLogin() {

		click("loginlink_CSS");
		
		return new LoginPage();
	}


	public void goToLearnMore() {

	}

	public void validateFooterLinks() {

	}

}
