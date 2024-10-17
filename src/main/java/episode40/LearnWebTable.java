package episode40;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://letcode.in/table");
		 WebElement table = driver.findElementById("simpletable");
		 List<WebElement> header =  table.findElements(By.tagName("th"));
		 for (WebElement headers : header) 
		 {
			 String rows =  headers.getText();
			 System.out.println(rows);
			
		}
		 
		 
		 
		 
		 
		 
	}
}