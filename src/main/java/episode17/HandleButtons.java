package episode17;


import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButtons {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
// get X and Y coordinates
//driver.findElementById("position").getLocation();

	WebElement ele = driver.findElementById("position");
	org.openqa.selenium.Point point = ele.getLocation();
	int x = point.getX();
	int y = point.getY();
	System.out.println("x ==>"+x   + "y ==>" +y);
			
// find the color of the button
	WebElement Btncolor = driver.findElementById("color");
	String color = Btncolor.getCssValue("background-color");
	System.out.println(color);
		
// find the height and width of the button
	
	Rectangle rect =  driver.findElementById("property").getRect();
	Dimension dime = rect.getDimension();
	System.out.println(dime);
	
// or System.out.println(dime.getWidth());
// System.out.println(dime.getHeight());
	
	rect.getHeight();
		
// Confirm button is disabled
	
	boolean isDisabled = driver.findElementById("isDisabled").isEnabled();
	System.out.println(isDisabled);
	
	
	driver.quit();
		
	}
}