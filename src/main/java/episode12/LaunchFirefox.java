package episode12;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		

	}

}
