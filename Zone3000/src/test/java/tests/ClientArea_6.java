package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import conf.Config;
import conf.Logger;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;
import elements.Variables;

public class ClientArea_6 extends Variables {
	
	@Test
	public void test() throws InterruptedException, IOException{	
		LoginPage loginPage = new LoginPage();
		MainPage mainPage = new MainPage();
		ProfilePage profilePage = new ProfilePage();
		Config config = new Config();
		Logger logger = new Logger();
		logger.name("Client area");
		
		loginPage.doLogin(email, password);		
		mainPage.goProfile();		
		String valueName = profilePage.getName();
		String valueEmail = profilePage.getEmail();
		String valuePassword = profilePage.getPassword();
		String valuePhone = profilePage.getPhone();
		String valueAddress = profilePage.getAddress();
		String valueSupport = profilePage.getSupport();
		String valueNewsletter = profilePage.getNewsletter();
		mainPage.doLogout();
		
		loginPage.doLogin(email, password);	
		mainPage.goProfile();		
		config.doAssertTrue(valueName, profilePage.getName());
		config.doAssertTrue(valueEmail, profilePage.getEmail());
		config.doAssertTrue(valuePassword, profilePage.getPassword());
		config.doAssertTrue(valuePhone, profilePage.getPhone());
		config.doAssertTrue(valueAddress, profilePage.getAddress());
		config.doAssertTrue(valueSupport, profilePage.getSupport());
		config.doAssertTrue(valueNewsletter, profilePage.getNewsletter());
	}
}
