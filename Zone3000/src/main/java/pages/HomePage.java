package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import conf.Config;
import conf.Logger;
import elements.Button;
import elements.Label;
import elements.Variables;

public class HomePage extends Variables {
	Logger logger = new Logger();
	Config config = new Config();
	
	public String locatorButtonPersonal = "//div[@class='filter-box ng-scope']/div[1]/div[1]/a";
	public String locatorButtonBusiness = "//div[@class='filter-box ng-scope']/div[1]/div[2]/a";
	public String locatorButtonEcommerce = "//div[@class='filter-box ng-scope']/div[1]/div[3]/a";
	public String locatorButtonOneDomain = "//div[@class='filter-box ng-scope']/div[2]/div[1]/a";
	public String locatorButtonMultiDomain = "//div[@class='filter-box ng-scope']/div[2]/div[2]/a";
	public String locatorButtonSubDomains = "//div[@class='filter-box ng-scope']/div[2]/div[3]/a";
		//Labels
	public Label labelCards  = new Label(By.xpath("//div[@class='cert-list clear']/div[1]"));
		//Buttons
	public Button buttonCheapest = new Button(By.xpath("//div[contains(@class,'sort-btn ng-scope')]"));
	public Button buttonPersonal = new Button(By.xpath(locatorButtonPersonal));
	public Button buttonBusiness = new Button(By.xpath(locatorButtonBusiness));
	public Button buttonEcommerce = new Button(By.xpath(locatorButtonEcommerce));
	public Button buttonOneDomain = new Button(By.xpath(locatorButtonOneDomain));
	public Button buttonMultiDomain = new Button(By.xpath(locatorButtonMultiDomain));
	public Button buttonSubDomains = new Button(By.xpath(locatorButtonSubDomains));
	
	
		//Methods		
	public void setFilterCheapestFeatured(String filterBy) throws InterruptedException {		
		if(filterBy.equals(cheapest) & !getTextCheapestFeatured().equals(cheapest)){
			logger.doClick("Featured");		
			buttonCheapest.click();
			Thread.sleep(1000);
		}else if(filterBy.equals(featured) & !getTextCheapestFeatured().equals(featured)){
			logger.doClick("Cheapest");		
			buttonCheapest.click();
			Thread.sleep(1000);
		}
	}
	
	public void setFilterBy(String filterBy) throws InterruptedException {
		
		if(filterBy.equals(personal)){
			if(!getActivityFilter(filterBy)){	
				logger.doClick("Personal");	
				buttonPersonal.click();
				Thread.sleep(1000);
			}
		}else if(filterBy.equals(business)){
			if(!getActivityFilter(filterBy)){	
				logger.doClick("Business");	
				buttonBusiness.click();
				Thread.sleep(1000);
			}
		}else if(filterBy.equals(ecommerce)){
			if(!getActivityFilter(filterBy)){	
				logger.doClick("Ecommerce");	
				buttonEcommerce.click();
				Thread.sleep(1000);
			}
		}else if(filterBy.equals(oneDomain)){
			if(!getActivityFilter(filterBy)){	
				logger.doClick("One domain");	
				buttonOneDomain.click();
				Thread.sleep(1000);
			}
		}else if(filterBy.equals(multiDomain)){
			if(!getActivityFilter(filterBy)){	
				logger.doClick("Multi domain");	
				buttonMultiDomain.click();
				Thread.sleep(1000);
			}
		}else if(filterBy.equals(subDomains)){
			if(!getActivityFilter(filterBy)){	
				logger.doClick("Sub domain");	
				buttonSubDomains.click();
				Thread.sleep(1000);
			}
		}
	}
	
	public void resetFilterBy() throws InterruptedException {	
		if(getActivityFilter(personal)){	
			logger.doClick(personal);	
			buttonPersonal.click();
			Thread.sleep(1000);
		}
		if(getActivityFilter(business)){	
			logger.doClick(business);	
			buttonBusiness.click();
			Thread.sleep(1000);
		}
		if(getActivityFilter(ecommerce)){	
			logger.doClick(ecommerce);	
			buttonEcommerce.click();
			Thread.sleep(1000);
		}
		if(getActivityFilter(oneDomain)){	
			logger.doClick(oneDomain);	
			buttonOneDomain.click();
			Thread.sleep(1000);
		}
		if(getActivityFilter(multiDomain)){	
			logger.doClick(multiDomain);	
			buttonMultiDomain.click();
			Thread.sleep(1000);
		}
		if(getActivityFilter(subDomains)){	
			logger.doClick(subDomains);	
			buttonSubDomains.click();
			Thread.sleep(1000);
		}
	}
	
		
	
		
	//Getters
	public int getCountLabels() throws InterruptedException {		
		return driver.findElements(By.xpath("//div[@class='cert-list clear']/div")).size();
	}
	
	public String getTextCheapestFeatured() throws InterruptedException {			
		return (String) buttonCheapest.getText();
	}
	
	public boolean getActivityFilter(String filterBy) throws InterruptedException {
		boolean result = false;
		String text = "";
		if(filterBy.equals(personal)){
			text = (String) buttonPersonal.getAttribute("class");
		}else if(filterBy.equals(business)){
			text = (String) buttonBusiness.getAttribute("class");
		}else if(filterBy.equals(ecommerce)){
			text = (String) buttonEcommerce.getAttribute("class");
		}else if(filterBy.equals(oneDomain)){
			text = (String) buttonOneDomain.getAttribute("class");
		}else if(filterBy.equals(multiDomain)){
			text = (String) buttonMultiDomain.getAttribute("class");
		}else if(filterBy.equals(subDomains)){
			text = (String) buttonSubDomains.getAttribute("class");
		}
		
		if(text.contains(activityActive)){
			result = true;
		}
		return result;
	}
	
	public boolean getCorrectFilter(int number, String textToAssert) throws InterruptedException {		
		boolean result = false;
		String text = (String) driver.findElement(By.xpath("//div[@class='cert-list clear']/div[" + number + "]")).getText();
		
		if(text.contains(textToAssert)){
			result = true;
		}
		return result;
	}
	
	public boolean getCorrectFilterByPrice(int firstNumber, int secondNumber) throws InterruptedException {		
		boolean result = false;
		int firstPrice = Integer.parseInt(driver.findElement(By.xpath("//div[@class='cert-list clear']/div[" + firstNumber + "]/div/div/price")).getAttribute("value"));
		int secondPrice = Integer.parseInt(driver.findElement(By.xpath("//div[@class='cert-list clear']/div[" + secondNumber + "]/div/div/price")).getAttribute("value"));
		
		if(firstPrice <= secondPrice){
			result = true;
		}
		return result;
	}
}
