package landingPageObjectCreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage() {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(id="username") private WebElement usernameTextField;
	
	@FindBy(name="pwd") private WebElement passwordTextField;
	
	@FindBy(id="loginButton") private WebElement loginButton;

	

}
