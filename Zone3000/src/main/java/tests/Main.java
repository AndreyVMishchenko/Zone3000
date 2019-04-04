package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Main {
	protected static EventFiringWebDriver driver;	
	protected static String baseUrl = "https://ssls.com";     	                                   
	
	@BeforeClass
    public static void setUp() throws Exception {       		
		System.setProperty("webdriver.chrome.driver", "libs\\chromedriver_2.43.exe");   
        ChromeOptions options = new ChromeOptions();               
        options.addArguments("--start-maximized");                  
        ChromeDriver chromeDriver = new ChromeDriver(options);     
        driver = new EventFiringWebDriver(chromeDriver);           
        getDriver().get(baseUrl);     
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
	public static WebDriver getDriver(){
        return driver;
    }     
    
	@AfterClass(alwaysRun = true)
    public void tearDown(){
        stopDriver();
    }
	
	public static void stopDriver(){
        driver.quit();
    }
}