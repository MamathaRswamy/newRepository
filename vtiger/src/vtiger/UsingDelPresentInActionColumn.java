package vtiger;

import org.testng.annotations.Test;

public class UsingDelPresentInActionColumn extends BaseClass{
	@Test
public void TC_19() {
		pomhomePagecred homePage=new pomhomePagecred(driver);
		pomInvoiceCredentials invoice=new pomInvoiceCredentials(driver); 
		homePage.getMoredropdown().click();
		homePage.getInvoicebutton().click();
		invoice.getActiondelete().click();
		String alertmsg = driver.switchTo().alert().getText();
		if(alertmsg.equalsIgnoreCase("Are You Sure You want to Delete?")) {
			driver.switchTo().alert().accept();
		}
		
}
}
