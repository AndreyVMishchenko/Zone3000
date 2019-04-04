package elements;

import org.openqa.selenium.By;

public class Label extends Element {

	public Label(By by) {
		super(by);
	}
	
	public void click() {
		composeWebElement(by).click();		
	}

	public String getText() {
		return composeWebElement(by).getText();
	}

	public Object getAttribute(String string) {
		return composeWebElement(by).getAttribute(string);
	}

	public void sendKeys(String chord) {
		composeWebElement(by).sendKeys(chord);
	}

}
