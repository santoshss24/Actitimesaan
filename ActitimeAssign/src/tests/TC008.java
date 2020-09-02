package tests;

import org.testng.annotations.Test;

import pages.Homepage;

public class TC008 extends BaseTest 
{
	@Test
	public void MovingATasktoTargetProject()
	{
		Homepage homepage=new Homepage(driver, webactionUtil);
		homepage.clickOnCreateNewTaskButton();
		homepage.clickOnNewCustomer();
		homepage.enterKeysInCustomerNameTF("ssaan");
		homepage.enterKeysInProjectNameTF("BBlack Pearl");
		homepage.enterKeysInTaskNameTF("Emailingg");
		homepage.enterKeysInEstimateTF(ESTIMATE_TIME);
		homepage.enterdeadlineDate();
		homepage.clickOnCreateTaskButton();
		
		homepage.MoveATaskToTargetProject("Emailingg","ssaan","BBlack Pearl");
	}
}
