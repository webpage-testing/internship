package visit.ictkerala.pages;

import visit.ictkerala.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class HomePage_TestSuite extends TestBase {

	HomePage homePageObj;

	@Test(priority = 1, alwaysRun = false)
	public void postValidate_urL() {
		String _currenturl, _givenurl = "https://quiet-dasik-c4c3a7.netlify.app/";
		HomePage homePageObj = new HomePage(driver);
		_currenturl = homePageObj.driver.getCurrentUrl();
		Assert.assertEquals(_currenturl, _givenurl);
	}

	@Test(priority = 2, alwaysRun = false)
	public void postValidate_welcomeHomePage() {

		boolean isWelcomeframeshow;

		HomePage homePageObj = new HomePage(driver);

		isWelcomeframeshow = homePageObj.showWelcomeTemplate();
		Assert.assertTrue(isWelcomeframeshow);
	}

	@Test(priority = 3, alwaysRun = false)
	public void postValidate_ictkLogo() {
		boolean isBrandLogo;

		HomePage homePageObj = new HomePage(driver);

		isBrandLogo = homePageObj.showBrandLogo();
		Assert.assertTrue(isBrandLogo);
	}

	@Test(priority = 4, alwaysRun = false)
	public void postValidate_loginButton() {
		boolean isbuttonlogin;

		HomePage homePageObj = new HomePage(driver);

		isbuttonlogin = homePageObj.button_ClickSignIn();
		Assert.assertTrue(isbuttonlogin);
	}

	@Test(priority = 5, alwaysRun = false)
	public void postValidate_homeButton() {
		boolean ishomebutton;

		HomePage homePageObj = new HomePage(driver);

		ishomebutton = homePageObj.button_Home();
		Assert.assertTrue(ishomebutton);
	}

	@Test(priority = 5, alwaysRun = false)
	public void postValidate_studentSubmissionButton() {
		boolean issubmissionbutton;

		HomePage homePageObj = new HomePage(driver);

		issubmissionbutton = homePageObj.button_Submissions();
		Assert.assertTrue(issubmissionbutton);
	}

}