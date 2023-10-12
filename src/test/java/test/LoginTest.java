package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	String userName="demo@techfios.com";
	String password="abc123";
	String dashboard="Dashboard";
	
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		//calling the init() method from Browserfactory class using the class name and 
		//also establishing the relation b/w driver from Browserfactory with driver in Logintest by assisgning it to the globalvariable of Logintest;
		 driver=BrowserFactory.init();
		 
		//establishing the relation b/w driver from LoginPage with driver in Logintest by using PageFactory ;
		 LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		 loginPage.insertUserName(userName);
		 loginPage.insertPassword(password);
		 loginPage.clickSignInButton();
		 
		 DashboardPage dashboardpage=PageFactory.initElements(driver, DashboardPage.class);
		 dashboardpage.verifyDashboardPage(dashboard);
		 BrowserFactory.tearDown();
	}

}
