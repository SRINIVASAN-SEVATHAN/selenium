package eposode33;


import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithActiveElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
