package testNGproject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPrvider {
	@DataProvider()
	public String[][] sendData(){
		String[][] sarr= {{"https://demo.actitime.com","admin","manager"},{"https://demo.actitime.com","trainee","trainee"}};
		return sarr;
	}


//File abspath=new File("./resource.TestData.xlsx"); FileInputStream fis=new FileInputStream(abspath);
	
	@Test(dataProvider="sendData")
	public void Test01(String url,String username,String password){
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password,Keys.ENTER);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}
}
