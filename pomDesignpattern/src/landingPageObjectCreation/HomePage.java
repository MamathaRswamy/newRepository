
package landingPageObjectCreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage() {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getReportButton() {
		return reportButton;
	}

	@FindBy(xpath="//a[@class='content reports']") private WebElement reportButton;
	
	@FindBy(id="logoutLink") private WebDriver logoutLink;
	public WebDriver getLogoutLink() {
		return logoutLink;
	}
	
	public LoginPage logOut() {
		logoutLink.close();
		return new LoginPage(driver);
		
	}
	
}
