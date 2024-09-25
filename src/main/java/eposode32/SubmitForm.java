package eposode32;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitForm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByName("email").sendKeys("koushik350@gmail.com");
		driver.findElementByName("password").sendKeys("Pass123$");
		// instead of click() here we using submit()
		driver.findElementByXPath("//button[text() ='LOGIN']").submit();
	}
	
	

}
