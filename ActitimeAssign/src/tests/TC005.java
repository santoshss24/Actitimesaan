package tests;

import org.testng.annotations.Test;

import pages.ViewTimeTrackpage;

public class TC005 extends BaseTest 
{
	@Test
	public void downloadPDF()
	{
		ViewTimeTrackpage VTT=new ViewTimeTrackpage(driver, webactionUtil);
		VTT.downloadthePDFofTimeTrack();
	}

}
