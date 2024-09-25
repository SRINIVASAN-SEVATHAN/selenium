package episode16;

import org.openqa.selenium.chrome.ChromeDriver;

public class Drivernavigationcommands {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		String Url = driver.getCurrentUrl();
		System.out.println("Button Page URL" +Url);
		
		Thread.sleep(3000);
		
		driver.findElementById("home").click();
		String Homeurl = driver.getCurrentUrl();
		System.out.println("Home Page URL"+ Homeurl);
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.navigate().to("https://dreamalliance.com/home");
		
		
		
		
		

	}

}
