package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.DashboardPage;

public class DashboardTest {
	WebDriver driver;
	String dashboard="Dashboard";
	public void verifyDashboard() {
		 DashboardPage dashboardpage=PageFactory.initElements(driver, DashboardPage.class);
		 dashboardpage.verifyDashboardPage(dashboard);
	}

}
