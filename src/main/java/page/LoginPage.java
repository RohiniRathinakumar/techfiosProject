package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver=driver;
}
	//Type 1
	//elements
	
	@FindBy(how=How.ID,using="username") WebElement USERNAME_ELEMENT;
	@FindBy(how=How.NAME,using="password") WebElement PASSWORD_ELEMENT;
	@FindBy(how=How.NAME,using="login") WebElement SUBMIT_ELEMENT;
	
	//Intractable methods
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	public void clickSignInButton() {
		SUBMIT_ELEMENT.click();
	}
//Type 2	
	public void performLogin(String username,String password) {
		USERNAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SUBMIT_ELEMENT.click();
	}
}


