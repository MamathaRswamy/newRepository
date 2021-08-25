package basicspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listen.ListnerImpimentation.class)
public class tc01 {
@Test(retryAnalyzer=listen.IretryAnalyserImple.class)
public void demo() {
	//System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	driver.get("http://www.instagram.com");
	int a=10/0;
}
}
