package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Page;
import crm.CRMHomePage;
import crm.accounts.AccountsPage;
import crm.accounts.CreateAccountsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;


public class LoginTest extends Page {

	public static void main(String[] args) {
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://zoho.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("tahseenkhanit@gmail.com", "zoho4645");
		zp.goToCRM();
		AccountsPage account = Page.menu.goToAccounts();
		CreateAccountsPage cap = account.goToCreateAccounts();
		cap.createAccount("Tahsu");

	}

}
