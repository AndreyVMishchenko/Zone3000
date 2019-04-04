package pages;

import org.openqa.selenium.By;

import conf.Config;
import conf.Logger;
import elements.Button;
import elements.Label;
import elements.Variables;

public class ProfilePage extends Variables {
	Logger logger = new Logger();
	Config config = new Config();
	
		//Labels
	public Label labelName = new Label(By.xpath("//form[contains(@name,'form')]/div[1]/div[2]"));
	public Label labelEmail = new Label(By.xpath("//form[contains(@name,'form')]/div[2]/div[2]"));
	public Label labelPassword = new Label(By.xpath("//form[contains(@name,'form')]/div[3]/div[2]"));
	public Label labelPhone = new Label(By.xpath("//form[contains(@name,'form')]/div[4]/div[2]"));
	public Label labelAddress = new Label(By.xpath("//form[contains(@name,'form')]/div[5]/div[2]"));
	public Label labelSupport = new Label(By.xpath("//form[contains(@name,'form')]/div[6]/div[2]"));
	public Label labelNewsletter = new Label(By.xpath("//form[contains(@name,'form')]/div[7]/div[2]"));
	
		//Fields
	//public Field fieldEmail = new Field(By.name("email"));
	//public Field fieldPassword = new Field(By.name("password"));
		//Buttons
	public Button buttonRefreshSupportPin = new Button(By.name("supportPin"));
	//public Button buttonProfile = new Button(By.xpath("//a[contains(@href,'/user/profile')]"));
	//public Button buttonLogout = new Button(By.xpath("//button[contains(@class,'drop-button')]"));	
	
	
	
		//Methods
	public void clickButtonRefreshSupportPin() throws InterruptedException {
		logger.doClick("Options");
		buttonRefreshSupportPin.click();
		Thread.sleep(1000);
	}
	
	
		
	//Getters	
	public String getName() throws InterruptedException {
		return (String) labelName.getText();
	}
	
	public String getEmail() throws InterruptedException {
		return (String) labelEmail.getText();
	}
	
	public String getPassword() throws InterruptedException {
		return (String) labelPassword.getText();
	}
	
	public String getPhone() throws InterruptedException {
		return (String) labelPhone.getText();
	}
	
	public String getAddress() throws InterruptedException {
		return (String) labelAddress.getText();
	}
	
	public String getSupport() throws InterruptedException {
		return (String) labelSupport.getText();
	}
	
	public String getNewsletter() throws InterruptedException {
		return (String) labelNewsletter.getText();
	}
}
