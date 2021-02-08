package crm.accounts;

import base.Page;

public class CreateAccountsPage extends Page {
	
	public void createAccount(String accountName) {
		
		type("accountname_ID",accountName);
		
		
	}

}
