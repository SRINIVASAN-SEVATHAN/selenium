package episode38;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {
		/*
		 * System.setProperty("WebDriver.Chrome.driver","/drivers/Chromedriver");
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.get("https://letcode.in/edit"); 
		 * List<WebElement> labels =
		 * driver.findElementsByTagName("label"); for (WebElement label : labels) {
		 * String text = label.getText(); System.out.println(text); }
		 */
		
		System.setProperty("WebDriver.Chrome.driver","/drivers/Chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/"); 
		driver.findElementByName("q").sendKeys("cricket",Keys.ENTER);
		List<WebElement> crickets = driver.findElementsByXPath("//*[contains(text(),'Cricket') or contains(text(),'cricket')]");
		System.out.println(crickets.size());
			
		}
		
			
		}

	


