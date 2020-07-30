package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebactionUtil;

public class Loginpage extends Basepage 
{
	@FindBy(id="username")
	public WebElement usernameTF;
	
	@FindBy(name="pwd")
	public WebElement passwordTF;
	
	@FindBy(id="loginButton")
	public WebElement loginbutton;
	
	public Loginpage(WebDriver driver, WebactionUtil webactionUtil) {
		super(driver, webactionUtil);
		// TODO Auto-generated constructor stub
	}
	
	public void login(String un,String pwd)
	{	webactionUtil.enterKeys(usernameTF, un);
		webactionUtil.enterKeys(passwordTF, pwd);
		webactionUtil.clickOnElement(loginbutton);
	}

}
