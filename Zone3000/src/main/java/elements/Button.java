package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Button extends Element {

	public Button(By by) {
		super(by);
	}
	
	public boolean isEnabled() {
		return composeWebElement(by).isEnabled();
	}

	public boolean isSelected() {
		return composeWebElement(by).isSelected();
	}
	
	public boolean isDisplayed() {
		return composeWebElement(by).isDisplayed();
	}

	public void perform() {		
	}
	
	public void click() {
		composeWebElement(by).click();
	}
	
	public Object getText() {
		return composeWebElement(by).getText();
	}
	
	public Object getAttribute(String text) {
		return composeWebElement(by).getAttribute(text);
	}		
	
	public void sendKeys(Keys clear) {
		composeWebElement(by).sendKeys(clear);
	}
}
