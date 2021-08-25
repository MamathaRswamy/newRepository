package listen;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

@SuppressWarnings("unused")
public class ListnerImpimentation implements ITestListener{
	
    public void onTestFailure(ITestResult Result) 					
    {		
 		TakesScreenshot errorshot= (TakesScreenshot) tclistnerTC01Test.driver; 
 		File tempfile = errorshot.getScreenshotAs(OutputType.FILE);
 		File destfile = new File("./errorshots/"+Result.getMethod().getMethodName()+".png");
 		try {
			FileUtils.copyFile(tempfile, destfile);
		} catch (IOException e) {
			
		}
    }		

}
