package tests;

import org.testng.annotations.Test;

import pages.Homepage;

public class TC002 extends BaseTest 
{
	@Test
	public void hidingaTask()
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
		homepage.clickOnHideRow(TASK_NAME);
		homepage.clickOnActionsButton();
		homepage.clickOnTaskDelete();
		homepage.clickOnDeleteTaskPermanently();
		homepage.logout();
		
	}

}
