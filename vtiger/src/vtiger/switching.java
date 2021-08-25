package vtiger;

import java.util.Set;

import org.testng.annotations.Test;

public class switching extends BaseClass {
	@Test
	public void demo() throws InterruptedException {
	pomhomePagecred homePage=new pomhomePagecred(driver);
	pomInvoiceCredentials invoice=new pomInvoiceCredentials(driver);
	homePage.getMoredropdown().click();
	homePage.getInvoicebutton().click();
	invoice.getCreateInvoiceLookupImg().click();
	String ids = driver.getWindowHandle();
	invoice.getSelectOrganizationlookupimg().click();
	//String hid = driver.getWindowHandle();
//	String expectedpge = "Organizations";
	Set<String> winhandles = driver.getWindowHandles();
	winhandles.remove(ids);
	for(String id:winhandles) {
		driver.switchTo().window(id);
	String acttitle=driver.getTitle();
	//	if(expectedpge.equalsIgnoreCase(acttitle)) {
	//	driver.manage().window().maximize();
		invoice.getVtigerinOrganizationpopup().click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.close();
		}
	}
}

