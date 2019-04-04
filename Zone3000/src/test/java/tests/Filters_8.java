package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import conf.Config;
import conf.Logger;
import pages.HomePage;
import elements.Variables;

public class Filters_8 extends Variables {
	
	@Test
	public void test() throws InterruptedException, IOException{	
		HomePage homePage = new HomePage();
		Config config = new Config();
		Logger logger = new Logger();
		logger.name("Filters");
		
		homePage.resetFilterBy();
		homePage.setFilterBy(personal);
		int countLabels_1 = homePage.getCountLabels();
		for(int i = 0, y = 1; i < countLabels_1; i ++, y++){
			config.doAssertTrue("Filter is correct", homePage.getCorrectFilter(y, domaiValidation));
		}
		homePage.resetFilterBy();
		
		homePage.setFilterBy(business);
		homePage.setFilterBy(oneDomain);
		int countLabels_2 = homePage.getCountLabels();
		for(int i = 0, y = 1; i < countLabels_2; i ++, y++){
			config.doAssertTrue("Filter is correct", homePage.getCorrectFilter(y, domain));
			config.doAssertTrue("Filter is correct", homePage.getCorrectFilter(y, organizationValidation));
		}
		homePage.resetFilterBy();
		
		homePage.setFilterCheapestFeatured(featured);
		config.doAssertTrue(featured, homePage.getTextCheapestFeatured());
		int countLabels_3 = homePage.getCountLabels();
		for(int i = 0, y = 1, z = 2; i < countLabels_3 - 1; i ++, y++, z++){
			config.doAssertTrue("Filter is correct", homePage.getCorrectFilterByPrice(y, z));			
		}
	}
}
