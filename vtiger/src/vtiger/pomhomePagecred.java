package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomhomePagecred {
public pomhomePagecred(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='More']")
private WebElement moredropdown;

public WebElement getMoredropdown() {
	return moredropdown;
}

public WebElement getInvoicebutton() {
	return invoicebutton;
}

public WebElement getSignoutLookupImg() {
	return signoutLookupImg;
}

public WebElement getSignoutButton() {
	return signoutButton;
}

public WebElement getServicesbutton() {
	return servicesbutton;
}
@FindBy(name="Invoice")
private WebElement invoicebutton;

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement signoutLookupImg;

@FindBy(xpath="//a[text()='Sign Out']")
private WebElement signoutButton;

@FindBy(name="Services")
private WebElement servicesbutton;





}


