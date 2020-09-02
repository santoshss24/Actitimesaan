package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import libraries.WebactionUtil;

public class Homepage extends Basepage 
{	
	WebDriverWait wait;
	JavascriptExecutor js;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbutton; 
	
	@FindBy(id="addTaskButtonId")
	private WebElement addTaskButton;
	
	@FindBy(xpath="(//div[@class='dropdownButton'])[5]")
	private WebElement customerdropdown;
		
	@FindBy(xpath="//div[contains(text(),'New Customer')]")
	private WebElement newcustomeroption;
	
	@FindBy(xpath="//input[contains(@class,\"newCustomer\")]")
	private WebElement customerNameTF;
	
	@FindBy(xpath="//input[contains(@class,\"newCustomer\") and @placeholder=\"Enter Project Name\"]")
	private WebElement projectNameTF;
	
	@FindBy(xpath="//input[@class=\"inputFieldWithPlaceholder\"]")
	private WebElement taskNameTF;
	
	@FindBy(xpath="//input[@class=\"inputFieldWithPlaceholder\" and @placeholder=\"not needed\"]")
	private WebElement estimateTimeTF;
	
	@FindBy(id="ext-gen40")
	private WebElement deadlinebutton;
	
	@FindBy(xpath="//button[.='August 2020']/../../../../../../../..//span[.='24']")
	private WebElement deadlinedateselection;
	
	@FindBy(xpath="//div[.='Create Tasks']")
	private WebElement createTaskButton;
	
	@FindBy(xpath="(//div[@class='taskNameContainer'])[1]")
	private WebElement mousehoveroverTask;
	
	@FindBy(xpath="//div[.='Calls']")
	private WebElement hideRow;
	
	@FindBy(xpath="//div[.='Copy Link']/..//div[.='ACTIONS']")
	private WebElement actionsButton; 
	
	@FindBy(xpath="//div[.='Delete']")
	private WebElement deleteTask;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deleteTaskPermanently;
	
	@FindBy(xpath="//div[.='Copy properties from existing tasks']")
	private WebElement copypropertieslink;
	
	@FindBy(xpath="(//td[@class=\"dropdownButton\"])[4]")
	private WebElement copyPropertiesDropdownButton;
	
	@FindBy(xpath="(//span[.='Copy properties'])[2]")
	private WebElement copyPropertiesButton;
	
	@FindBy(id="scbutton")
	private WebElement saveButtonForEditTimeTrackComments;
	
	@FindBy(xpath="//div[.='Copy to']")
	private WebElement CopyTaskTo;
	
	@FindBy(xpath="//div[.='Select target project to copy task to:']/..//div[@class=\"dropdownButton\"]")
	private WebElement selectCustomerDropdownInCopyTask;
	
	@FindBy(xpath="//div[.='Copy']")
	private WebElement copyButtonInCopyTask;
	
	@FindBy(xpath="//div[.='Move to']")
	private WebElement Moveto;
	
	@FindBy(xpath="(//div[.='Select target project to move task to:']/..//div[@class=\"dropdownButton\"])[1]")
	private WebElement SelectCustomerDropdownInMoveTask;
	
	@FindBy(xpath="//div[.='Move']")
	private WebElement moveButtonInMoveTask;
	
	@FindBy(xpath="//span[.='Add Tasks from the List']")
	private WebElement addTasksFromListLink;
	
	@FindBy(xpath="//td[@class=\"dropdownButton\"]")
	private WebElement selectCustomerDropdownAddTasksFromListLink;
	
	@FindBy(xpath="//td[.='Big Bang Company']")
	private WebElement selectCustomerorProjectInDropdownAddTasksFromList;
	
	@FindBy(xpath="//span[.='Flight analysis']")
	private WebElement SelectTaskInAddTasksfromList;
	
	@FindBy(xpath="//button[.='Add Selected']")
	private WebElement AddSelectedButtonInAddTasksFromlist;
	
	
	public Homepage(WebDriver driver, WebactionUtil webactionUtil) {
		super(driver, webactionUtil);
	}
	
	public void clickOnCreateNewTaskButton()
	{
		webactionUtil.clickOnElement(addTaskButton);
	}
	
	public void clickOnNewCustomer()
	{	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webactionUtil.clickOnElement(customerdropdown);
		webactionUtil.clickOnElement(newcustomeroption);
	}
	public void enterKeysInCustomerNameTF(String customerName)
	{
		webactionUtil.enterKeys(customerNameTF,customerName);
	}
	public void enterKeysInProjectNameTF(String projectName)
	{
		webactionUtil.enterKeys(projectNameTF,projectName);
	}
	public void enterKeysInTaskNameTF(String taskName)
	{
		webactionUtil.enterKeys(taskNameTF, taskName);
	}
	public void enterKeysInEstimateTF(String estimateTime)
	{
		webactionUtil.enterKeys(estimateTimeTF,estimateTime);
	}
	public void enterdeadlineDate()
	{
		webactionUtil.clickOnElement(deadlinebutton);
		webactionUtil.clickOnElement(deadlinedateselection);
	}
	public void clickOnCreateTaskButton()
	{
		webactionUtil.clickOnElement(createTaskButton);
	}
	public void clickOnHideRow(String taskName)
	{
		
		WebElement mousehover = driver.findElement(By.xpath("//div[.='"+taskName+"']"));
		webactionUtil.hoverOverAnElement(mousehover);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(mousehover));
		webactionUtil.clickOnElement(mousehover);
	}
	
	public void clickOnActionsButton()
	{
		webactionUtil.clickOnElement(actionsButton);
	}
	public void clickOnTaskDelete()
	{
		wait.until(ExpectedConditions.visibilityOf(deleteTask));
		webactionUtil.clickOnElement(deleteTask);
	}
	
	public void clickOnDeleteTaskPermanently()
	{
		webactionUtil.clickOnElement(deleteTaskPermanently);
	}
	
	public void copyPropertiesFromExistingTask(String ProjectNametocopyproperties, String TaskNametoCopyProperties)
	{
		webactionUtil.clickOnElement(copypropertieslink);
		WebElement projectnametocopytask = driver.findElement(By.xpath("//span[.='Select customer or project']/..//..//input[@type=\"text\"]"));
		webactionUtil.clickOnElement(projectnametocopytask);
		webactionUtil.enterKeys(projectnametocopytask, ProjectNametocopyproperties);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		WebElement projectname = driver.findElement(By.xpath("(//td[.='"+ProjectNametocopyproperties+"'])[2]"));
//		webactionUtil.clickOnElement(projectname);
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement TaskNametocopyproperties = driver.findElement(By.xpath("(//span[@class='"+TaskNametoCopyProperties+"'])[5]"));
		wait.until(ExpectedConditions.visibilityOf(TaskNametocopyproperties));
		webactionUtil.clickOnElement(TaskNametocopyproperties);
		webactionUtil.clickOnElement(copyPropertiesButton);
	}
	public void EditTheCommentsOfTheParticularTask(String keysToSend,String taskName)
	{
		WebElement comments = driver.findElement(By.xpath("//div[.='"+taskName+"']/../../../../../..//a[@class=\"cursorImageLink\"]"));
		webactionUtil.clickOnElement(comments);
		webactionUtil.enterKeys(keysToSend);
		webactionUtil.clickOnElement(saveButtonForEditTimeTrackComments);
	}
	
	public void copyATaskToTargetProject(String taskName,String customerName,String ProjectName)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200);");
		WebElement clickOnTask = driver.findElement(By.xpath("//div[.='"+taskName+"']"));
		webactionUtil.clickOnElement(clickOnTask);
		webactionUtil.clickOnElement(actionsButton);
		webactionUtil.clickOnElement(CopyTaskTo);
		webactionUtil.clickOnElement(selectCustomerDropdownInCopyTask);
		webactionUtil.enterKeys(customerName);
		WebElement customername = driver.findElement(By.xpath("//div[.='"+customerName+"']"));
		wait.until(ExpectedConditions.visibilityOf(customername));
		webactionUtil.clickOnElement(customername);
		WebElement selectproject = driver.findElement(By.xpath("//div[.='- Select Project -']"));
		webactionUtil.clickOnElement(selectproject);
		WebElement selectProjectFromDropdown = driver.findElement(By.xpath("//div[.='"+ProjectName+"']"));
		webactionUtil.clickOnElement(selectProjectFromDropdown);
		webactionUtil.clickOnElement(copyButtonInCopyTask);
	}
	public void MoveATaskToTargetProject(String taskName,String customerName,String ProjectName)
	{
		WebElement clickOnTask = driver.findElement(By.xpath("//div[.='"+taskName+"']"));
		webactionUtil.clickOnElement(clickOnTask);
		webactionUtil.clickOnElement(actionsButton);
		webactionUtil.clickOnElement(Moveto);
		webactionUtil.clickOnElement(SelectCustomerDropdownInMoveTask);
		WebElement customername = driver.findElement(By.xpath("//div[.='"+customerName+"']"));
		webactionUtil.clickOnElement(customername);
	
//		WebElement selectproject = driver.findElement(By.xpath("//div[.='- Select Project -']"));
//		webactionUtil.clickOnElement(selectproject);
//		WebElement selectProjectFromDropdown = driver.findElement(By.xpath("//div[.='"+ProjectName+"']"));
//		webactionUtil.clickOnElement(selectProjectFromDropdown);
		webactionUtil.clickOnElement(moveButtonInMoveTask);
		
	}
	
	public void clickOnAddTasksfromListLink()
	{
		webactionUtil.clickOnElement(addTasksFromListLink);
	}
	public void ClickOnCustomerOrProjectInSelectCustomer()
	{
		webactionUtil.clickOnElement(selectCustomerDropdownAddTasksFromListLink);
		webactionUtil.clickOnElement(selectCustomerorProjectInDropdownAddTasksFromList);
	}
	public void ClickOnTaskFromAddTasksfromtheList()
	{
		webactionUtil.clickOnElement(SelectTaskInAddTasksfromList);
	}
	public void clickOnAddSelectedButton()
	{
		webactionUtil.clickOnElement(AddSelectedButtonInAddTasksFromlist);
	}
	public void logout()
	{
		webactionUtil.clickOnElement(logoutbutton);
	}
}
