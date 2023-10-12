package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	String userName="demo@techfios.com";
	String password="abc123";
	
	String addCustomer="Add Contact";
	String dashboard="Dashboard";
	
	String name="Rohini";
	String company="Bank Of America";
	String email="demo@techfios.com";
	String Phone="12345";
	@Test
	public void userShouldBeAbleToAddCustomer() throws InterruptedException {
		driver=BrowserFactory.init();
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.performLogin(userName, password);
		
		  
		 DashboardPage dashboardpage=PageFactory.initElements(driver, DashboardPage.class);
		 dashboardpage.verifyDashboardPage(dashboard);
		 dashboardpage.clickOnCustomer();
		 dashboardpage.clickOnAddCustomer();
		 
		 AddCustomerPage addcustomerpage=PageFactory.initElements(driver,AddCustomerPage.class);
		 addcustomerpage.verifyAddCutomerPage(addCustomer);
		 addcustomerpage.insertFullName(name);
		 addcustomerpage.insertComapanyName(company);
		 addcustomerpage.insertEmailName(email);
		 addcustomerpage.insertPhoneNumber(Phone);
		 addcustomerpage.clickOnSaveButton();
		 addcustomerpage.clickOnListOfCustomers();
			 
			 
	}

}
