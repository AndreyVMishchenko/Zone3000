package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import conf.Config;
import conf.Logger;
import pages.LoginPage;
import elements.Variables;

public class CopyOfAuthorizationUserWithoutCredantials_4 extends Variables {
	
	@Test
	public void test() throws InterruptedException, IOException{	
		LoginPage loginPage = new LoginPage();
		Config config = new Config();
		Logger logger = new Logger();
		logger.name("Copy of authorization user without credantials");
		
		loginPage.clickButtonLigIn();
		loginPage.inputEmail(empty);
		loginPage.inputPassword(password);		
		loginPage.clickButtonLogin();
		config.doAssertTrue(promptEmptyEmail, loginPage.getPromptEmail());
		
		loginPage.inputEmail(email);
		loginPage.inputPassword(empty);		
		config.doAssertTrue(promptEmptyPassword, loginPage.getPromptPassword());
		
		loginPage.inputEmail(empty);
		loginPage.inputPassword(empty);		
		config.doAssertTrue(promptEmptyEmail, loginPage.getPromptEmail());		
		config.doAssertTrue(promptEmptyPassword, loginPage.getPromptPassword());		
	}
}
