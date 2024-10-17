package episode39;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://letcode.in/windows");
		 String windowhandle =  driver.getWindowHandle();
		 System.out.println(windowhandle);
		 driver.findElementById("home").click();
		 Set<String> windowhandles = driver.getWindowHandles();
		 System.out.println(windowhandles);
		 List<String> List = new ArrayList<String>(windowhandles);
		 driver.switchTo().window(List.get(1));
		 System.out.println(driver.getCurrentUrl());
		 driver.switchTo().window(List.get(0));
		 driver.close();
		 Set<String> windowhandles2 = driver.getWindowHandles();
		 List.clear();
		 List.addAll(windowhandles2);
		 driver.switchTo().window(List.get(0));
		 String currenturl2 =  driver.getCurrentUrl();
		 System.out.println(currenturl2);
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
