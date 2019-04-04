package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import conf.Config;
import conf.Logger;
import pages.LoginPage;
import pages.MainPage;
import elements.Variables;

public class AuthorizationOldUser_1 extends Variables {
	
	@Test
	public void test() throws InterruptedException, IOException{	
		LoginPage loginPage = new LoginPage();
		MainPage mainPage = new MainPage();
		Logger logger = new Logger();
		Config config = new Config();
		logger.name("Authorization old user");
		
		loginPage.clickButtonLigIn();
		loginPage.inputEmail(email);
		loginPage.inputPassword(password);
		config.doAssertTrue(activityPassword, loginPage.getActivityPassword());
		
		loginPage.clickButtonEye();
		config.doAssertTrue(activityText, loginPage.getActivityPassword());
		
		loginPage.clickButtonLogin();
		config.doAssertTrue(email, mainPage.getEmail());
	}
}
