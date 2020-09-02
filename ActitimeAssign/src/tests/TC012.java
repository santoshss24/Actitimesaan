package tests;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.ViewTimeTrackpage;

public class TC012 extends BaseTest 
{
	@Test
	public void addTaskToParticularProject()
	{
		ViewTimeTrackpage viewTimeTrack =new ViewTimeTrackpage(driver, webactionUtil);	
		viewTimeTrack.viewTimeTrackPage();
		Homepage homepage=viewTimeTrack.ClickOnEnterTimeTrackPage();
		homepage.clickOnAddTasksfromListLink();
		homepage.ClickOnCustomerOrProjectInSelectCustomer();
		homepage.ClickOnTaskFromAddTasksfromtheList();
		homepage.clickOnAddSelectedButton();
		
		
		
		
	}

}
