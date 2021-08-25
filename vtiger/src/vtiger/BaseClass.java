package vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeMethod
	public void bfrmethod() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pomLoginCred login=new pomLoginCred(driver);
		login.getUsernameTextField().sendKeys("admin");
		login.getPasswordTextField().sendKeys("root");
		login.getSubmitbutton().click();

	}
	@AfterMethod(alwaysRun=true)
	public void afterMethod() throws InterruptedException {
		pomhomePagecred homepage=new pomhomePagecred(driver);
		homepage.getSignoutLookupImg().click();
		homepage.getSignoutButton().click();
		driver.close();
	}
}
