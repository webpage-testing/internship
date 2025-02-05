package visit.ictkerala.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	/* Method description of message "Welcome to VisitApp" */
	public boolean showWelcomeTemplate() {
		boolean _welcomevalue;
		WebElement displayWelcomeTemplate = driver.findElement(By.xpath(
				"//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-s18byi']"));
		_welcomevalue = displayWelcomeTemplate.isDisplayed();
		return _welcomevalue;
	}

	/* Method showing brandLogo" */
	public boolean showBrandLogo() {
		boolean _logovalue;
		WebElement displayBrandLogo = driver.findElement(By.xpath("//img[@alt='Logo']"));
		_logovalue = displayBrandLogo.isDisplayed();
		return _logovalue;
	}

	/* Method showing text welcome back" */
	public boolean showWelcomeBackMsg() {
		boolean isshowWelcomeBackMsg;
		WebElement txtDisplay_welcomeback = driver
				.findElement(By.xpath("//h4[normalize-space()='ICTAK Offline Programs: Back to physical sessions']"));
		isshowWelcomeBackMsg = txtDisplay_welcomeback.isEnabled();
		return isshowWelcomeBackMsg;
	}

	/* Method Login Button */
	public boolean button_ClickSignIn() {
		boolean isloginbutton;
		WebElement btnsignIn = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		isloginbutton = btnsignIn.isDisplayed();
		btnsignIn.isEnabled();
		return isloginbutton;
	}

	/* Method Home Button */
	public boolean button_Home() {
		boolean ishome;
		WebElement btnsignishome = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		ishome = btnsignishome.isDisplayed();
		btnsignishome.isEnabled();
		return ishome;
	}

	/* Method Student Button */
	public boolean button_Submissions() {
		boolean isSubmissionsbutton;
		WebElement btnsignInSubmissions = driver.findElement(By.xpath("//a[normalize-space()='Student Submissions']"));
		isSubmissionsbutton = btnsignInSubmissions.isDisplayed();
		btnsignInSubmissions.isEnabled();
		return isSubmissionsbutton;
	}
}