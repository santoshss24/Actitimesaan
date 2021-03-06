package tests;

import org.testng.annotations.Test;

import pages.Homepage;

public class TC007 extends BaseTest 
{
	@Test
	public void addingCommentsToTask()
	{
		Homepage homepage=new Homepage(driver, webactionUtil);
		homepage.clickOnCreateNewTaskButton();
		homepage.clickOnNewCustomer();
		homepage.enterKeysInCustomerNameTF(CUSTOMER_NAME);
		homepage.enterKeysInProjectNameTF(PROJECT_NAME);
		homepage.enterKeysInTaskNameTF(TASK_NAME);
		homepage.enterKeysInEstimateTF(ESTIMATE_TIME);
		homepage.enterdeadlineDate();
		homepage.clickOnCreateTaskButton();
	//	String customerName = GenericPropertyLib.getValue(PROPERTYFILE_PATH, "targetCustomerName");
	//	String projectName = GenericPropertyLib.getValue(PROPERTYFILE_PATH, "targetProjectame");
		
		homepage.copyATaskToTargetProject(TASK_NAME, "Big Bang Company","Flight operations");
	}
}
