package episode14;

import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElementByLinkText("Log in").click();
	}
		
		
		

}
