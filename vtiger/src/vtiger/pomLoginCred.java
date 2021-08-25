package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomLoginCred {
public pomLoginCred(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(name="user_name")
private WebElement usernameTextField;


@FindBy(name="user_password")
private WebElement passwordTextField;

public WebElement getUsernameTextField() {
	return usernameTextField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getSubmitbutton() {
	return submitbutton;
}
@FindBy(id="submitButton")
private WebElement submitbutton;

}
