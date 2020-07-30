package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import libraries.Getphoto;
import libraries.IAutoConstants;
import libraries.WebactionUtil;
import pages.Homepage;
import pages.Loginpage;

public class BaseTest implements IAutoConstants
{
	public WebDriver driver;
	public WebactionUtil webactionUtil;
	
	
	@BeforeClass
	public void launchApp()
	{
		if (BROWSER_NAME.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver=new ChromeDriver(options);
		}
		else if (BROWSER_NAME.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			FirefoxOptions options=new FirefoxOptions();
			options.addPreference("dom.webnotifications.enabled", false);
		}else 
		{
			throw new IllegalArgumentException(BROWSER_NAME+"browserNotSupported");
		}
		driver.manage().window().maximize();
		long implicit=Long.parseLong(ITO);
		driver.manage().timeouts().implicitlyWait(implicit, TimeUnit.SECONDS);
		long explicit=Long.parseLong(ETO);
		webactionUtil=new WebactionUtil(driver, explicit);
		driver.get(APP_URL);	
		}
	
		@Parameters({"un","pwd"})
		@BeforeMethod
		public void loginToApp(@Optional(USERNAME)String un,@Optional(PASSWORD)String pwd)
		{
			Loginpage l=new Loginpage(driver, webactionUtil);
			l.login(un,pwd);
		}
		
		@AfterMethod
		public void logoutFromApp(ITestResult results)
		{
			if (results.getStatus()==1) {
				Getphoto.getphoto(driver, results.getName());
				Homepage homepage=new Homepage(driver, webactionUtil);
				homepage.logout();
			}
		}
		@AfterClass(alwaysRun=true)
		public void closeApp()
		{
			driver.quit();
		}
		

}
