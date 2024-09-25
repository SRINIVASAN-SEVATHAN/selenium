package episode19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
//simple alert
		driver.findElementById("accept").click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple Text =>" +text);
		alert.accept();
// confirm alert
// alert.dismiss();
		
// Prompt alert
		
		driver.findElementById("prompt").click();
		driver.switchTo().alert().getText();
		alert.sendKeys("SRINIVASAN");
		alert.accept();
		String name = driver.findElementById("myName").getText();
		System.out.println(name);
		
	}

}
