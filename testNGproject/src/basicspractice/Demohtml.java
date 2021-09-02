package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demohtml {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Mamatha/Desktop/mmmm.html");
	driver.findElement(By.partialLinkText("le")).click();
	Thread.sleep(4000);
	driver.quit();

}
}
