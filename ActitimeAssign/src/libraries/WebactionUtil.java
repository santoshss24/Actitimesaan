package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebactionUtil 
{
	WebDriver driver;
	WebDriverWait wait;
	long ETO;
	public WebactionUtil(WebDriver driver, long ETO) {
		this.driver=driver;
		wait=new WebDriverWait(driver, ETO);
		this.ETO=ETO;
	}
	public void clickOnElement(WebElement target)
	{
		wait.until(ExpectedConditions.elementToBeClickable(target));
		target.click();
	}
	public void enterKeys(WebElement target,String keysToSend)
	{
		wait.until(ExpectedConditions.visibilityOf(target));
		target.clear();
		target.sendKeys(keysToSend);
		
	}
	public void enterKeys(String keysToSend)
	{
		driver.switchTo().activeElement().sendKeys(keysToSend);
	}
	public void selectTextFromDropdown(WebElement target,String text)
	{
		Select select=new Select(target);
		select.selectByVisibleText(text);
	}
	public void hoverOverAnElement(WebElement Element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(Element);
	}
	

}
