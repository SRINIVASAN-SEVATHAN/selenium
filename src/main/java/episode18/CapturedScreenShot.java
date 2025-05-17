package episode18;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturedScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
// Screenshot of visible part		
		File Firstsrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img1.png");
		FileHandler.copy(Firstsrc, dest);
		
// Screenshot of particular element(button)
		
	WebElement ele = driver.findElement("home");
	File elesrc = ele.getScreenshotAs(OutputType.FILE);
	File  eledst = new File("./snaps/img2.png");
	FileHandler.copy(elesrc, eledst);
		
// Screenshot of particular dew file (particular section)
	
	WebElement info = driver.findElementByClassName("card-content");
	elesrc = info.getScreenshotAs(OutputType.FILE);
	eledst = new File("./snaps/img3.png");
	FileHandler.copy(elesrc, eledst);
	
	driver.quit();
	
	}

}
