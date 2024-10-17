package episode41;


import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {

	public static void main(String[] args) 
	{
		
		System.setProperty("We.chrome.driver","/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//span[text()='Electronics']").click();
		WebElement elec = driver.findElementByXPath("//span[.= 'Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(elec).perform();
		WebElement apple = driver.findElement(By.linkText("Apple"));
		wait.until(ExpectedConditions.visibilityOf(apple));
		//WebElement appleLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Apple")));
		apple.click();
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.findElementByName("email").sendKeys("koushik350@gmail.com");
		 * driver.findElementByName("password").sendKeys("Pass123$");
		 * driver.findElementByXPath("//button[text()='LOGIN']").click(); WebElement
		 * toast = driver.findElementByXPath("//div[@role = 'alertdialog']");
		 * wait.until(ExpectedConditions.visibilityOf(toast));
		 * System.out.println(toast.getText());
		 * wait.until(ExpectedConditions.invisibilityOf(toast));
		 * driver.findElementByLinkText("Sign out").click();
		 */
		
				
				
				
		/*
		 * driver.get("https://letcode.in/waits");
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.findElementById("accept").click(); WebDriverWait wait = new
		 * WebDriverWait(driver, 30); Alert until =
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * System.out.println(until.getText()); until.accept();
		 */
		
		
		//driver.switchTo().alert().accept();
		
	}

}
