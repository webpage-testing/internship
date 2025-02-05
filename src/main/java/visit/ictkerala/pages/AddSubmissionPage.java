package visit.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddSubmissionPage {
	WebDriver driver;

	public AddSubmissionPage(WebDriver driver) {
		this.driver = driver;
	}

	/* Method description of message "Welcome to VisitApp" */
	public boolean showWelcomeTemplate() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		boolean _swelcomevalue;
		WebElement displayWelcomeTemplate = driver
				.findElement(By.xpath("//h4[normalize-space()='ADD STUDENT SUBMISSION']"));
		_swelcomevalue = displayWelcomeTemplate.isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		return _swelcomevalue;
	}

	/* Method Student Button */
	public boolean button_Submissions() {
		boolean isSubmissionsbutton;
		WebElement signInSubmissions = driver.findElement(By.xpath("//a[normalize-space()='Student Submissions']"));
		isSubmissionsbutton = signInSubmissions.isDisplayed();
		signInSubmissions.isEnabled();
		signInSubmissions.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		return isSubmissionsbutton;
	}

	/* Method Student submit Button */
	public boolean button_SubmissionsSubmit() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		boolean isInsideSubmissionsbutton;

		WebElement signInsideSubmissions = driver.findElement(By.xpath("//button[normalize-space()='SUBMIT']"));
		isInsideSubmissionsbutton = signInsideSubmissions.isDisplayed();
		signInsideSubmissions.isEnabled();
		signInsideSubmissions.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		return isInsideSubmissionsbutton;
	}

	/* Method to read User Id */
	public void postSubmission_detail() {
		WebElement txtbox_name = driver.findElement(By.xpath("//input[@id=':rq:']"));
		txtbox_name.sendKeys("StudentTest");

		WebElement dropdown = driver.findElement(By.xpath("(//select[@id=':rr:'])"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("KKEM March DSA");

		WebElement txtbox_email = driver.findElement(By.xpath("//input[@id=':rt:']"));
		txtbox_email.sendKeys("StudentTest@gmail.com");

		WebElement txtbox_link = driver.findElement(By.xpath("//input[@id=':ru:']"));
		txtbox_link.sendKeys("https://linktest.com");

	}

}