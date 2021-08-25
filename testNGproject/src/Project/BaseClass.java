package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;


public class BaseClass {
	public WebDriver driver;
	@Parameters({"browsername"})
	@BeforeMethod
	public void reaData(String  bname) {
		if(bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			driver=new FirefoxDriver();

		} else if(bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			driver=new ChromeDriver();

		}
	}
	@AfterMethod
	public void aftmethod() {
		driver.close();
	}

}
