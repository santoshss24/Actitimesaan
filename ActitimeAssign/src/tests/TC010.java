package tests;

import org.testng.annotations.Test;

import pages.ViewTimeTrackpage;

public class TC010 extends BaseTest
{
	@Test
	public void ApplyingFiltersToViewTimeTrack()
	{
		ViewTimeTrackpage viewTimeTrack=new ViewTimeTrackpage(driver, webactionUtil);
		viewTimeTrack.viewTimeTrackPage();
		viewTimeTrack.clickOnFiltersLink();
		viewTimeTrack.clickOnSelectCustomerProjectDropdown();
		viewTimeTrack.clickOnCustomerorProjectRadioButton();
		viewTimeTrack.resetFilterlink();
		viewTimeTrack.closeButtonOnCustomerorprojectdropdown();
		viewTimeTrack.ReadyforApprovalcheckbox();
		viewTimeTrack.ApplyButtonOnfiltersPopup();

}

}
