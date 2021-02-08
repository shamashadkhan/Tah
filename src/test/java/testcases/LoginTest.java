package testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import utilities.TestUtil;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void loginTest(Hashtable<String, String> data) {
		
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		lp.doLogin(data.get("username"),data.get("password"));
		Assert.fail("LoginTest failed as Assertfail is applied");
		
	

	}

}
