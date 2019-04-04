package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import conf.Config;
import conf.Logger;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;
import elements.Variables;

public class RefreshSupportPin_7 extends Variables {
	
	@Test
	public void test() throws InterruptedException, IOException{	
		LoginPage loginPage = new LoginPage();
		MainPage mainPage = new MainPage();
		ProfilePage profilePage = new ProfilePage();
		Config config = new Config();
		Logger logger = new Logger();
		logger.name("Refresh support pin");
		
		loginPage.doLogin(email, password);		
		mainPage.goProfile();		
		String valueSupport = profilePage.getSupport();
		profilePage.clickButtonRefreshSupportPin();
		config.doAssertFalse(valueSupport, profilePage.getSupport());
	}
}
