package visit.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	/* Method Login Button on HomePage*/
	public boolean button_ClickSignIn() {
		boolean isloginbutton;
		WebElement btnsignIn = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		isloginbutton = btnsignIn.isDisplayed();
		btnsignIn.isEnabled();
		btnsignIn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return isloginbutton;
	}

	/* Method User-Id text box */
	public boolean showtextBox_UserID() {
		boolean useridValue;
		WebElement txtbox_userId = driver.findElement(By.xpath("//input[@id=':r0:']"));
		useridValue = txtbox_userId.isEnabled();
		return useridValue;
	}

	/* Method passWord text box */
	public boolean showtextBox_Password() {
		boolean istxtbox_passWord;
		WebElement txtbox_passWord = driver.findElement(By.xpath("//input[@id=':r1:']"));
		istxtbox_passWord = txtbox_passWord.isEnabled();
		return istxtbox_passWord;
	}

	/* Method to read User Id */
	public void postLogin_UserManagerID() {
		WebElement txtbox_userId = driver.findElement(By.xpath("//input[@id=':r0:']"));
		txtbox_userId.sendKeys("admin@gmail.com");
		WebElement txtbox_passWord = driver.findElement(By.xpath("//input[@id=':r1:']"));
		txtbox_passWord.sendKeys("admin@12345");
	}

	/* Method to sign-in in Login Page windows */
	public boolean button_SignIn() {
		boolean isloginbutton;
		WebElement btnsignIn = driver.findElement(By.xpath("button[normalize-space()='Log in']"));
		isloginbutton = btnsignIn.isDisplayed();
		btnsignIn.click();
		return isloginbutton;
	}
}