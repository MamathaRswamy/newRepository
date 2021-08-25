package listen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listen.ListnerImpimentation.class)
public class tclistnerTC01Test  {

	public static 	WebDriver driver;
	@Test
	public void implem() {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://instagram.com");
		int a=10/0;
	}
}
