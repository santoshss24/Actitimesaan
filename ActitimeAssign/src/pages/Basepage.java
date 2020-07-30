package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import libraries.WebactionUtil;

public class Basepage 
{
	public WebDriver driver;
	public WebactionUtil webactionUtil;
	public Basepage(WebDriver driver,WebactionUtil webactionUtil) {
		this.driver=driver;
		this.webactionUtil=webactionUtil;
		PageFactory.initElements(driver, this);
	}

}
