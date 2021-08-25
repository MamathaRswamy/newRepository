package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomInvoiceCredentials {
public pomInvoiceCredentials(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//img[@title='Create Invoice...']")
private WebElement createInvoiceLookupImg;

public WebElement getValphebetBox() {
	return ValphebetBox;
}
@FindBy(xpath="//input[@value='Delete']")
private WebElement deleteButton;

@FindBy(name="subject")
private WebElement subjectTextBox;

@FindBy(xpath="//input[@value='Add Service']")
private WebElement addService;

@FindBy(xpath="//a[@id='popup_product_127']")
private WebElement serviceElement;

public WebElement getAddService() {
	return addService;
}

public WebElement getServiceElement() {
	return serviceElement;
}

public WebElement getServiceLookUpImg() {
	return serviceLookUpImg;
}
@FindBy(id="searchIcon2")
private WebElement serviceLookUpImg;

@FindBy(id="alpha_22")
private WebElement ValphebetBox;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveButtonInInvoice;

public WebElement getSaveButtonInInvoice() {
	return saveButtonInInvoice;
}

public WebElement getQtyButtonInInvoice() {
	return qtyButtonInInvoice;
}

public WebElement getVtigerinOrganizationpopup() {
	return vtigerinOrganizationpopup;
}
@FindBy(name="qty1")
private WebElement qtyButtonInInvoice;

@FindBy(xpath="//a[text()='vtiger']")
private WebElement vtigerinOrganizationpopup;

public WebElement getCreateInvoiceLookupImg() {
	return createInvoiceLookupImg;
}

public WebElement getDeleteButton() {
	return deleteButton;
}

public WebElement getSubjectTextBox() {
	return subjectTextBox;
}

public WebElement getInvoiceDateTextBox() {
	return invoiceDateTextBox;
}

public WebElement getSelectOrganizationlookupimg() {
	return selectOrganizationlookupimg;
}

public WebElement getBillingAddressTextBox() {
	return billingAddressTextBox;
}

public WebElement getShippingAddressTextBox() {
	return shippingAddressTextBox;
}
@FindBy(name="invoicedate")
private WebElement invoiceDateTextBox;

@FindBy(xpath="//input[@name='account_name']/..//img[@alt='Select']\r\n")
private WebElement selectOrganizationlookupimg;
@FindBy(xpath="//td[text()='INV1 ']/..//a[text()='del']")
private WebElement actiondelete;
//td[text()='INV1 ']/..//a[text()='del']
@FindBy(name="bill_street")
private WebElement billingAddressTextBox;

public WebElement getActiondelete() {
	return actiondelete;
}
@FindBy(name="ship_street")
private WebElement shippingAddressTextBox;









}
