package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebactionUtil;

public class Homepage extends Basepage 
{	
	@FindBy(id="logoutLink")
	private WebElement logoutbutton; 
	
	@FindBy(id="addTaskButtonId")
	private WebElement addTaskButton;
	
	@FindBy(xpath="(//div[@class=\"selectedItem\"])[5]")
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
	
	@FindBy(xpath="(//button[text()='July 2020']/../../../../../../../..//span[text()='30'])[2]")
//	@FindBy(xpath="(//button[text()='June 2020']/../../../../../../../..//span[text()='25'])[2]")
	private WebElement deadlinedateselection;
	
	@FindBy(xpath="//div[.='Create Tasks']")
	private WebElement createTaskButton;
	
	public Homepage(WebDriver driver, WebactionUtil webactionUtil) {
		super(driver, webactionUtil);
	}
	
	public void clickOnCreateNewTaskButton()
	{
		webactionUtil.clickOnElement(addTaskButton);
	}
	
	public void clickOnNewCustomer()
	{	
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
	public void logout()
	{
		webactionUtil.clickOnElement(logoutbutton);
	}

}
