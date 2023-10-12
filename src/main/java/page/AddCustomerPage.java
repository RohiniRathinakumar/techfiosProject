package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public void AddCustomerPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")	WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class='md-btn md-btn-primary waves-effect waves-light']")	WebElement SAVE_ELEMENT;
	@FindBy(how = How.CSS, using = "a[href$='https://techfios.com/billing/?ng=contacts/list/']")	WebElement CUSTOMER_LIST_ELEMENT;


	public void verifyAddCutomerPage(String addcustomer) {
		Assert.assertEquals(ADD_CUSTOMER_HEADER_ELEMENT.getText(), addcustomer, "Add cutomer page not found");
	}

	public void insertFullName(String name) {
		FULL_NAME_ELEMENT.sendKeys(name + generateRandomNumber(999));

	}

	public void insertComapanyName(String company) {

		selectFromDropdown(COMPANY_ELEMENT, company);
	}

	public void insertEmailName(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNumber(999) + email);

	}
	public void insertPhoneNumber(String phone) {
		PHONE_ELEMENT.sendKeys(phone +generateRandomNumber(999));

	}
	public void clickOnSaveButton() {
		SAVE_ELEMENT.click();

}

	public void clickOnListOfCustomers() throws InterruptedException {
		Thread.sleep(2000);
		CUSTOMER_LIST_ELEMENT.click();
		
	}
}