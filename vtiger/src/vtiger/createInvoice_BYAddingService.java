package vtiger;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class createInvoice_BYAddingService extends BaseClass {
	@Test
	public void TC_18() throws InterruptedException {
		pomhomePagecred homePage=new pomhomePagecred(driver);
		pomInvoiceCredentials invoice=new pomInvoiceCredentials(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;

		homePage.getMoredropdown().click();
		homePage.getInvoicebutton().click();
		invoice.getCreateInvoiceLookupImg().click();
		String homePageid =driver.getWindowHandle();
		invoice.getSubjectTextBox().sendKeys("Motog");
		invoice.getShippingAddressTextBox().sendKeys("Hadapsar,Pune ");
		invoice.getBillingAddressTextBox().sendKeys("Hadapsar,Pune ");
		invoice.getInvoiceDateTextBox().sendKeys("22-07-2018");
		invoice.getQtyButtonInInvoice().sendKeys("1");
		invoice.getSelectOrganizationlookupimg().click();
		Set<String> popupId = driver.getWindowHandles();
		popupId.remove(homePageid);
		for(String Windowid:popupId) {
			driver.switchTo().window(Windowid);
			invoice.getVtigerinOrganizationpopup().click();
			driver.switchTo().alert().accept();
		}
		WebElement servicebutton = invoice.getAddService();
		js.executeScript("argument[0].scrollIntoView(false)",servicebutton);

		invoice.getServiceLookUpImg().click();
		Set<String> servicePage = driver.getWindowHandles();
		popupId.remove(homePageid);
		for(String Windowid:servicePage) {
			driver.switchTo().window(Windowid);
			invoice.getServiceElement().click();
			driver.switchTo().alert().accept();
		}
		
	}

}
