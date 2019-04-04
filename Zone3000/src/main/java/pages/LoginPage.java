package pages;

import org.openqa.selenium.By;
import conf.Config;
import conf.Logger;
import elements.Button;
import elements.Field;
import elements.Label;
import elements.Variables;

public class LoginPage extends Variables {
	Logger logger = new Logger();
	Config config = new Config();
	
		//Labels
	public Label labelEditingAccount = new Label(By.className("uni-title-output"));
	public Label labelPromptNonexistentUser = new Label(By.xpath("//span[contains(@class,'noty_text')]"));
	public Label labelPromptInvalidEmail = new Label(By.xpath("//div[@class='form-group email']/div/div/div/span"));
	public Label labelPromptEmail = new Label(By.xpath("//div[@class='form-group email']/div[2]/div/div/span"));
	public Label labelPromptPassword = new Label(By.xpath("//div[@class='form-group']/div[2]/div/div/span"));
		//Fields
	public Field fieldEmail = new Field(By.name("email"));
	public Field fieldPassword = new Field(By.name("password"));
		//Buttons
	public Button buttonLogIn = new Button(By.xpath("//div[contains(@class,'log-box')]/a"));
	public Button buttonLogin = new Button(By.xpath("//form[@name='authForm']/div[3]/button"));
	public Button buttonEye = new Button(By.xpath("//span[contains(@class,'icon icon-eye')]"));
		
	
	
		//Methods
	public void clickButtonLigIn() throws InterruptedException {
		logger.doClick("LOG IN");
		buttonLogIn.click();
		Thread.sleep(3000);
	}
	
	public void inputEmail(String email) throws InterruptedException {
		logger.doInput("Email = '" + email + "'");
		fieldEmail.clear();
		fieldEmail.sendKeys(email);
	}
	
	public void inputPassword(String password) throws InterruptedException {
		logger.doInput("Email = '" + password + "'");
		fieldPassword.clear();
		fieldPassword.sendKeys(password);
	}
	
	public void clickButtonEye() throws InterruptedException {
		logger.doClick("Eye");
		buttonEye.click();
		Thread.sleep(1000);
	}
	
	public void clickButtonLogin() throws InterruptedException {
		logger.doClick("Login");
		buttonLogin.click();
		Thread.sleep(3000);
	}
	
	public void doLogin(String email, String password) throws InterruptedException {
		clickButtonLigIn();
		inputEmail(email);
		inputPassword(password);	
		clickButtonLogin();
	}
	
	
		
	//Getters
	public String getActivityPassword() throws InterruptedException {
		return (String) fieldPassword.getAttribute("type");
	}
	
	public String getTextEmail() throws InterruptedException {
		return (String) fieldEmail.getText();
	}
	
	public String getPromptNonexistentUser() {		
		return labelPromptNonexistentUser.getText();
	}
	
	public String getPromptInvalidEmail() {		
		return labelPromptInvalidEmail.getText();
	}
	
	public String getPromptEmail() {		
		return labelPromptEmail.getText();
	}
	
	public String getPromptPassword() {		
		return labelPromptPassword.getText();
	}
}
