package episode25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele =  driver.findElementByXPath("//span[.='Men']");
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		driver.findElementByLinkText("Watches").click();
		
		
	}

}
