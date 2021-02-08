package crm.accounts;

import org.openqa.selenium.By;

import base.Page;

public class AccountsPage extends Page{
	
	public CreateAccountsPage goToCreateAccounts() {
		
		click("createaccountbtn_CSS");
		
		return new CreateAccountsPage();
		
	}
	
	public void goToImportAccounts() {
		
		
	}

}
