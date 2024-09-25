package episode30;

import java.nio.file.WatchEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// isDiplayed
		
		  WebElement login = driver.findElementByLinkText("Log in"); 
		  boolean displayed = login.isDisplayed(); 
		 System.out.println(displayed);
		 
		
		// isEnabled
		
		
		  driver.get("https://letcode.in/edit/"); WebElement edit =
		  driver.findElementById("noEdit"); Boolean edit1 = edit.isEnabled();
		  System.out.println(edit1);
		 
		
		// isSelected
		
		driver.get("https://letcode.in/radio");
		WebElement remember =  driver.findElementByXPath("//label[@class='checkbox']//input[1]");
		System.out.println(remember.isSelected());
		
	}

}
