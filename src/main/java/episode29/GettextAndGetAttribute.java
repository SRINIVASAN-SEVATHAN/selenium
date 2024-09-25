package episode29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GettextAndGetAttribute {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Get Text
		
		String head =  driver.findElementByTagName("h1").getText();
		System.out.println(head);
		
		String head1 = driver.findElementByClassName("card-content").getText();
		System.out.println(head1);
		
		// Get Attribute
		
		String attribute = driver.findElementById("join").getAttribute("value");
		System.out.println(attribute);
		
		String attribute1 = driver.findElementById("join").getAttribute("id");
		System.out.println(attribute1);
		
		String attribute3 = driver.findElementById("fullName").getAttribute("placeholder");
		System.out.println(attribute3);
		driver.quit();
		
	}

}
