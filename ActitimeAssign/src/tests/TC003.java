package tests;

import org.testng.annotations.Test;

import pages.Homepage;

public class TC003 extends BaseTest 
{

	@Test
	public void copyproperties()
	{
		Homepage homepage=new Homepage(driver, webactionUtil);
		homepage.clickOnCreateNewTaskButton();
		homepage.clickOnNewCustomer();
		homepage.enterKeysInCustomerNameTF(CUSTOMER_NAME);
		homepage.enterKeysInProjectNameTF(PROJECT_NAME);

		homepage.copyPropertiesFromExistingTask("Big Bang Company", "Flight analysis");
		


	}
}
