package vtiger;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateInvoiceWithInvalidInvoiceDate extends BaseClass {
	@Test
	public void TC_17() throws InterruptedException, AWTException {
		pomhomePagecred homePage=new pomhomePagecred(driver);
		pomInvoiceCredentials invoice=new pomInvoiceCredentials(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Robot robot=new Robot();
		
		homePage.getMoredropdown().click();
		homePage.getInvoicebutton().click();
		invoice.getCreateInvoiceLookupImg().click();
		String homePageid =driver.getWindowHandle();
		
		invoice.getSubjectTextBox().sendKeys("Motog");
		invoice.getShippingAddressTextBox().sendKeys("Hadapsar,Pune ");
		invoice.getBillingAddressTextBox().sendKeys("Hadapsar,Pune ");
		js.executeScript("arguments[0].value='22-07-2018'",invoice.getInvoiceDateTextBox() );
		invoice.getQtyButtonInInvoice().sendKeys("1");
		invoice.getSelectOrganizationlookupimg().click();
		Set<String> popupId = driver.getWindowHandles();
		popupId.remove(homePageid);
		for(String Windowid:popupId) {
			driver.switchTo().window(Windowid);
			invoice.getVtigerinOrganizationpopup().click();
			driver.switchTo().alert().accept();
		}

		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_S);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
