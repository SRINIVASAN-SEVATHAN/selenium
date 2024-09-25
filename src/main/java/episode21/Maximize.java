package episode21;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		// short test case
		driver.manage().window().maximize();
		
		//or brief test case
		
		/*Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();*/
	}

}
