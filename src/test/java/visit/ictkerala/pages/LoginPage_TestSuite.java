package visit.ictkerala.pages;

import visit.ictkerala.pages.LoginPage;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class LoginPage_TestSuite extends TestBase {

	LoginPage loginPageObj;

	@Test(priority = 1, alwaysRun = false)
	public void postValidate_loginButton() {
		boolean isbuttonlogin;

		LoginPage loginPageObj = new LoginPage(driver);

		isbuttonlogin = loginPageObj.button_ClickSignIn();
		Assert.assertTrue(isbuttonlogin);

	}

	/* Method for User Login - Manager */
	@Test(priority = 2, alwaysRun = false)
	public void postUserLoginLogout_Admin() {
		boolean isShowUserid, isShowPassword, isbuttonlogin;

		LoginPage loginPageObj = new LoginPage(driver);

		isShowUserid = loginPageObj.showtextBox_UserID();
		Assert.assertTrue(isShowUserid);

		isShowPassword = loginPageObj.showtextBox_Password();
		Assert.assertTrue(isShowPassword);

		loginPageObj.postLogin_UserManagerID();

		isbuttonlogin = loginPageObj.button_SignIn();
		Assert.assertTrue(isbuttonlogin);

	}

}