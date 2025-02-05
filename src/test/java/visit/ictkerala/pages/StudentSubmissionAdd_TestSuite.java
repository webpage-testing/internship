package visit.ictkerala.pages;

import visit.ictkerala.pages.AddSubmissionPage;
import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class StudentSubmissionAdd_TestSuite extends TestBase {

	AddSubmissionPage asPageObj;

	@Test(priority = 1, alwaysRun = false)
	public void postValidate_studentSubmissionButton() {
		boolean issubmissionbutton;

		AddSubmissionPage asPageObj = new AddSubmissionPage(driver);

		issubmissionbutton = asPageObj.button_Submissions();
		Assert.assertTrue(issubmissionbutton);
	}

	@Test(priority = 2, alwaysRun = false)
	public void postValidate_studentSubmissionWindow() {
		boolean issubmissionbutton;

		AddSubmissionPage asPageObj = new AddSubmissionPage(driver);

		issubmissionbutton = asPageObj.showWelcomeTemplate();
		Assert.assertTrue(issubmissionbutton);
	}

	@Test(priority = 3, alwaysRun = false)
	public void postValidate_studentSubmissionDetail() {

		AddSubmissionPage asPageObj = new AddSubmissionPage(driver);
		asPageObj.postSubmission_detail();
		asPageObj.button_SubmissionsSubmit();
	}

}