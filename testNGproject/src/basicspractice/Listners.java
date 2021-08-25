package basicspractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class Listners implements ITestListener{
	WebDriver driver=new ChromeDriver();
	public void onTestFailure(ITestResult results) {
		TakesScreenshot errorshot =(TakesScreenshot)driver;
		File screenShot = errorshot.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./errorshots"+results.getMethod()+".png");
		try {
			FileUtils.copyFile(screenShot, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
