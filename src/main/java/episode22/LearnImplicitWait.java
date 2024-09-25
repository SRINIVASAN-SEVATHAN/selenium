package episode22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitWait {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dreamalliance.com/");
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Login").click();
		
		//driver.findElementByLinkText("Log in").click();
		
// Wrong elements("email") means it will 10 seconds and throws exception
		
		//driver.findElementByName("email").sendKeys("koushik@gmail.com");
		//driver.findElementByName("password").sendKeys("Pass123$");
	}

}
