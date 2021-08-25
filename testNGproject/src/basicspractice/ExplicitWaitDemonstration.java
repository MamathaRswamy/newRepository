package basicspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemonstration {
	public static void main(String[] args) {
		//Launching the Browser
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Navigating To Application
		driver.get("https://demo.actitime.com");

		//Creating object of Webdriverwait
		WebDriverWait wait=new WebDriverWait(driver, 20);

		//calling Until() on webDriver object and passing the ExpectedConditions
		wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com"));

		wait.until(ExpectedConditions.titleContains("demo"));

		wait.until(ExpectedConditions.alertIsPresent());	

	}
}













