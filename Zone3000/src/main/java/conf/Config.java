package conf;

import static org.testng.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import elements.Button;
import elements.Element;
import elements.Field;
import elements.Label;
import elements.Variables;

public class Config extends Variables {
	
	public void dateTime(){
		Date dateNow = new Date();
	    SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy-hh:mm:ss");
	    System.out.print("[" + formatForDateNow.format(dateNow) + "]");
	}
	
	
	
	public void doAssertTrue(String i, String y) throws IOException{
		dateTime();
		System.out.print("[AssertTrue]");
		System.out.println("Value = '" + i + "'; veb = '" + y + "'");
		if(!i.equals(y)){
			int number = (int) (Math.random() * 100000);
			String name = "Screen-" + number + ".png";		
		 	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		 	
			FileUtils.copyFile(scrFile, new File("libs\\Screens\\" + name + ".png"));	
			
			/*File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			BufferedImage fullImg = ImageIO.read(screenshot); 
			BufferedImage eleScreenshot= fullImg.getSubimage(0, 0, 100, 300); 
			ImageIO.write(eleScreenshot, "png", screenshot); 
				
			File screenshotLocation = new File("libs\\Screens\\10.png"); 
			FileUtils.copyFile(screenshot, screenshotLocation); */
				
			dateTime();
			System.out.println("[Info]Â ñâÿçè ñ îøèáêîé ñðàâíåíèÿ ñäåëàí ñêðèí ¹ " + name + ".png");
		}
		assertTrue(i.equals(y));
	}
	
	public void doAssertFalse(String i, String y) throws IOException{
		dateTime();
		System.out.print("[AssertFalse]");
		System.out.println("Value = '" + i + "'; veb = '" + y + "'");
		if(i.equals(y)){
			int number = (int) (Math.random() * 100000);
			String name = "Screen-" + number + ".png";		
		 	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("libs\\Screens\\" + name + ".png"));	
				
			dateTime();
			System.out.println("[Info]Â ñâÿçè ñ îøèáêîé ñðàâíåíèÿ ñäåëàí ñêðèí ¹ " + name + ".png");
		}
		assertTrue(!i.equals(y));
	}
	
	public void doAssertTrue(int i, int y) throws IOException{
		dateTime();
		System.out.print("[AssertTrue]");
		System.out.println("Value = '" + i + "'; veb = '" + y + "'");
		if(i != (y)){
			int number = (int) (Math.random() * 100000);
			String name = "Screen-" + number + ".png";		
		 	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("libs\\Screens\\" + name + ".png"));	
				
			dateTime();
			System.out.println("[Info]Â ñâÿçè ñ îøèáêîé ñðàâíåíèÿ ñäåëàí ñêðèí ¹ " + name + ".png");
			
		}
		assertTrue(i == y);	
	}
	
	public void doAssertTrue(String i, Boolean y) throws IOException{
		dateTime();
		System.out.print("[AssertTrue]");
		System.out.println("veb = " + i + " = '" + y + "'");
		if(!y){
			int number = (int) (Math.random() * 100000);
			String name = "Screen-" + number + ".png";		
		 	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("libs\\Screens\\" + name + ".png"));	
				
			dateTime();
			System.out.println("[Info]Â ñâÿçè ñ îøèáêîé ñðàâíåíèÿ ñäåëàí ñêðèí ¹ " + name + ".png");
		}
		assertTrue(y);
	}
	
	public void doAssertFalse(String i, Boolean y) throws IOException{
		dateTime();
		System.out.print("[AssertFalse]");
		System.out.println("veb = " + i + " = '" + y + "'");
		if(y){
			int number = (int) (Math.random() * 100000);
			String name = "Screen-" + number + ".png";		
		 	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("libs\\Screens\\" + name + ".png"));	
				
			dateTime();
			System.out.println("[Info]Â ñâÿçè ñ îøèáêîé ñðàâíåíèÿ ñäåëàí ñêðèí ¹ " + name + ".png");
		}
		assertTrue(!y);
	}
}
