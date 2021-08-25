package vtiger;

import org.testng.annotations.Test;

public class searchRecordsAlphabetically extends BaseClass{
	@Test
public void TC_20() {
	pomhomePagecred homePage=new pomhomePagecred(driver);
	pomInvoiceCredentials invoice=new pomInvoiceCredentials(driver); 
	homePage.getMoredropdown().click();
	homePage.getInvoicebutton().click();
	invoice.getValphebetBox().click();
}
}
