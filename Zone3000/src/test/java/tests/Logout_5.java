package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import conf.Config;
import conf.Logger;
import pages.LoginPage;
import pages.MainPage;
import elements.Variables;

public class Logout_5 extends Variables {
	
	@Test
	public void test() throws InterruptedException, IOException{	
		LoginPage loginPage = new LoginPage();
		MainPage mainPage = new MainPage();
		Config config = new Config();
		Logger logger = new Logger();
		logger.name("Logout");
		
		loginPage.doLogin(email, password);	
		mainPage.doLogout();
		config.doAssertTrue(empty, loginPage.getTextEmail());
		config.doAssertTrue(activityPassword, loginPage.getActivityPassword());
	}
}
