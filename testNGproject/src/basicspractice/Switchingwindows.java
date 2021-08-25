
package basicspractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingwindows{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://naukri.com");
		String homepage = driver.getWindowHandle();
		
		Set<String> pageId = driver.getWindowHandles();
		pageId.remove(homepage);
		for(String id:pageId) {
			if(id!=homepage) {
				driver.switchTo().window(id);
				driver.close();
			}
		}
	}
}
