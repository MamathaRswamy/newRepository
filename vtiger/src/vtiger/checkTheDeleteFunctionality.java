package vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class checkTheDeleteFunctionality extends BaseClass{
	@Test
	public void TC_16() throws InterruptedException {
		pomhomePagecred homePage=new pomhomePagecred(driver);
		pomInvoiceCredentials invoice1=new pomInvoiceCredentials(driver);

		homePage.getMoredropdown().click();
		homePage.getInvoicebutton().click();
		invoice1.getDeleteButton().click();
		Thread.sleep(3000);
		String alertmsg = driver.switchTo().alert().getText();
		if(alertmsg.equalsIgnoreCase("Please Select At Least One Entity")) {
			driver.switchTo().alert().accept();
		}

	}
}
