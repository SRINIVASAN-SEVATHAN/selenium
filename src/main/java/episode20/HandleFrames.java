package episode20;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
// example for frame with name or id
		
		WebElement Myframe = driver.findElementByXPath("//iframe[@src = 'frameUI']");
		driver.switchTo().frame(Myframe);
		
//driver.switchTo().frame(0);
		driver.findElementByName("fname").sendKeys("SRINIVASAN");
		driver.findElementByName("lname").sendKeys("S");
		
		driver.switchTo().frame(1);
		driver.findElementByName("email").sendKeys("s.seenu0208@gmail.com");
		
		driver.switchTo().parentFrame();
		driver.findElementByName("lname").sendKeys(".Sevathan");
//driver.switchTo().defaultContent();
// after enter lastname it should go to watch tutorial page
		
		driver.switchTo().parentFrame();
		driver.findElementByXPath("//a[@href='/video/frames']").click();
		
		
	}

}
