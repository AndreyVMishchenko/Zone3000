package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import conf.Config;
import conf.Logger;
import pages.LoginPage;
import elements.Variables;

public class AuthorizationUserWithInvalidEmail_3 extends Variables {
	
	@Test
	public void test() throws InterruptedException, IOException{	
		LoginPage loginPage = new LoginPage();
		Logger logger = new Logger();
		Config config = new Config();
		logger.name("Authorization user with invalid email");
		
		loginPage.clickButtonLigIn();
		loginPage.inputEmail(emailInvalid);
		loginPage.inputPassword(password);
		config.doAssertTrue(activityPassword, loginPage.getActivityPassword());
		
		loginPage.clickButtonEye();
		config.doAssertTrue(activityText, loginPage.getActivityPassword());
		
		loginPage.clickButtonLogin();
		config.doAssertTrue(promptInvalidEmail, loginPage.getPromptInvalidEmail());
	}
}
