package tests;

import org.testng.annotations.Test;

import pages.Homepage;

public class TC001 extends BaseTest 
{
	@Test
	public void creatingATask()
	{
		Homepage h=new Homepage(driver, webactionUtil);
		h.clickOnCreateNewTaskButton();
		h.clickOnNewCustomer();
		h.enterKeysInCustomerNameTF(CUSTOMER_NAME);
		h.enterKeysInProjectNameTF(PROJECT_NAME);
		h.enterKeysInTaskNameTF(TASK_NAME);
		h.enterKeysInEstimateTF(ESTIMATE_TIME);
		h.enterdeadlineDate();
		h.clickOnCreateTaskButton();
	}
}
