package pages;

import org.openqa.selenium.By;
import conf.Config;
import conf.Logger;
import elements.Button;
import elements.Label;
import elements.Variables;

public class MainPage extends Variables {
	Logger logger = new Logger();
	Config config = new Config();
	
		//Labels
	public Label labelEmail = new Label(By.xpath("//div[contains(@class,'profile-box clear ng-scope')]/a"));
		//Fields
	//public Field fieldEmail = new Field(By.name("email"));
	//public Field fieldPassword = new Field(By.name("password"));
		//Buttons
	public Button buttonOptions = new Button(By.xpath("//div[contains(@class,'profile-box clear ng-scope')]/button"));
	public Button buttonProfile = new Button(By.xpath("//a[contains(@href,'/user/profile')]"));
	public Button buttonLogout = new Button(By.xpath("//button[contains(@class,'drop-button')]"));	
	
	
	
		//Methods
	public void goProfile() throws InterruptedException {
		logger.doClick("Options");
		buttonOptions.click();
		Thread.sleep(1000);
		logger.doClick("Profile");
		buttonProfile.click();
		Thread.sleep(1000);
	}	
	
	public void doLogout() throws InterruptedException {
		logger.doClick("Options");
		buttonOptions.click();
		Thread.sleep(1000);
		logger.doClick("Log out");
		buttonLogout.click();
		Thread.sleep(1000);
	}	
	
	
		
	//Getters
	public String getEmail() throws InterruptedException {
		return (String) labelEmail.getText();
	}
}
