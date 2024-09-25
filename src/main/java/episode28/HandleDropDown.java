package episode28;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement fruit = driver.findElementById("fruits");
		Select myfruits = new Select(fruit); 
		myfruits.selectByVisibleText("Apple");
		myfruits.selectByVisibleText("Banana");
		
		// Listout all options in dropdown
		
		List<WebElement> Alllist =  myfruits.getOptions();
		Alllist.forEach(i -> System.out.println(i.getText()));
		
		
		
		// Select using value
		
		WebElement country = driver.findElementById("country");
		Select Mycountry = new Select(country);
		Mycountry.selectByValue("India");
		WebElement selectedcountry = Mycountry.getFirstSelectedOption();
		System.out.println(selectedcountry.getText());
		
		WebElement heros = driver.findElementById("superheros");
		Select myheros = new Select(heros);
		boolean ismul =  myheros.isMultiple();
		myheros.selectByIndex(1);
		myheros.selectByValue("bt");
		myheros.deselectByIndex(1);

	}

}
