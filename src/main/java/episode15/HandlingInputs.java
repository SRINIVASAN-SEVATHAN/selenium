package episode15;

import java.security.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	public static void main(String[] args) {
		System.setProperty("webdrivre.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
//Enter your full name
		driver.findElementById("fullName").sendKeys("srinivasan Sevathan");
		
// Append a text and press keyboard tab
		
		driver.findElementById("join").sendKeys("Person",Keys.TAB);
		
// What is inside the text box
		
		String myvalue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(myvalue);
		
// Clear the text
		
		driver.findElementById("clearMe").clear();
		
// Confirm edit field is disabled
		
		boolean isedit = driver.findElementById("noEdit").isEnabled();
		System.out.println(isedit);
		
// Confirm text is readonly

		String isreadonly = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(isreadonly );
// quit
		driver.quit();
		
	}

}
