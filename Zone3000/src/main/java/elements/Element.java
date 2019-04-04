package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.Main;

public class Element extends Main {
    protected By by;

	public Element(By by){
        this.by = by;
    }

	protected WebElement composeWebElement(By by){
		return getDriver().findElement(by);
    }
        
    /*public void waitForElementToBeVisible() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        //Не работает
    }
    
    public void waitForElementToBeClickable() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(by));
      //Не работает
    }
    
    public void scrollToElement() {
        try {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", composeWebElement(by));
        } catch (StaleElementReferenceException ignore) {           
        }
      //Не работает
    }        */
}

