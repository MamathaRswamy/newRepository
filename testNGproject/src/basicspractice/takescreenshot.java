package basicspractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class takescreenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://instagram.com");
	File sample = driver.getScreenshotAs(OutputType.FILE);
	File file=new File("./errorshots/demo.png");
	FileUtils.copyFile(sample, file);
	}
}


