package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Page;
import crm.accounts.AccountsPage;
import crm.accounts.CreateAccountsPage;
import pages.ZohoAppPage;
import utilities.TestUtil;

public class CreateAccountTest {
	
	@Test(dataProviderClass = TestUtil.class,dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account = Page.menu.goToAccounts();
		CreateAccountsPage cap = account.goToCreateAccounts();
		cap.createAccount(data.get("accountname"));
		
	}

}
