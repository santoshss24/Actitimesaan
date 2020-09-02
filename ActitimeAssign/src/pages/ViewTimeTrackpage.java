package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import libraries.WebactionUtil;

public class ViewTimeTrackpage extends Basepage
{
	JavascriptExecutor js;
	WebDriverWait wait;
	
	@FindBy(xpath="//a[.='View Time-Track']")
	private WebElement ViewTimeTrack;
	
	@FindBy(xpath="//td[contains(.,'Export to PDF')]")
	private WebElement ExportToPDF;
	
	@FindBy(id="viewTTPdfPreviewLightbox_downloadPdfBtn")
	private WebElement DownloadPDFButton;
	
	@FindBy(xpath="//canvas[@height=\"589\"]")
	private WebElement previewpdf;
	
	@FindBy(xpath="//div[.='Filters']")
	private WebElement filterslink;
	
	@FindBy(id="cpSelector")
	private WebElement filtersCustomerorprojectdropdown;
	
	@FindBy(xpath="//label[.='Selected customers and projects']/..//img[@class=\"x-form-radio\"]")
	private WebElement filtersCustomerandprojectRadioButton;
	
	@FindBy(xpath="//span[.='reset filter']")
	private WebElement filtersresetFilterlink;
	
	@FindBy(xpath="//span[.='Close']")
	private WebElement filtersCloseButton;
	
	@FindBy(id="viewTTStatusCheckboxId_1")
	private WebElement readyForApprovalCheckbox;
	
	@FindBy(id="applyFilterEdit")
	private WebElement filtersApplyButton;
	
	@FindBy(linkText="Enter Time-Track")
	private WebElement EnterTimeTrackPage;
	
	public ViewTimeTrackpage(WebDriver driver, WebactionUtil webactionUtil) 
	{
		super(driver, webactionUtil);
	}
	
	public void downloadthePDFofTimeTrack()
	{
		
		webactionUtil.clickOnElement(ViewTimeTrack);
		webactionUtil.clickOnElement(ExportToPDF);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(previewpdf));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",DownloadPDFButton);
		webactionUtil.clickOnElement(DownloadPDFButton);
		
	}
	
	public void viewTimeTrackPage()
	{
		webactionUtil.clickOnElement(ViewTimeTrack);
		
	}

	public void clickOnFiltersLink()
	{
		webactionUtil.clickOnElement(filterslink);
	}
	public void clickOnSelectCustomerProjectDropdown()
	{
		webactionUtil.clickOnElement(filtersCustomerorprojectdropdown);
	}
	public void clickOnCustomerorProjectRadioButton()
	{
		webactionUtil.clickOnElement(filtersCustomerandprojectRadioButton);
	}
	public void resetFilterlink()
	{
		webactionUtil.clickOnElement(filtersresetFilterlink);
	}
	
	public void closeButtonOnCustomerorprojectdropdown()
	{
		webactionUtil.clickOnElement(filtersCloseButton);
	}
	public void ReadyforApprovalcheckbox()
	{
		webactionUtil.clickOnElement(readyForApprovalCheckbox);
	}
	public void ApplyButtonOnfiltersPopup()
	{
		webactionUtil.clickOnElement(filtersApplyButton);
	}
	
	public Homepage ClickOnEnterTimeTrackPage()
	{
		webactionUtil.clickOnElement(EnterTimeTrackPage);
		return null;
	}
}
