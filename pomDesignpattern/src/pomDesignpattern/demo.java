package pomDesignpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class demo {
public static void main(String[] args) {
	System.setProperty("webdriver.opera.driver", "./softwares/operadriver.exe");
	WebDriver driver=new OperaDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
}
}
