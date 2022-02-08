package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByName{

	ChromeDriver driver ;

	@BeforeTest

	public void openURL () 
	{
		String chromepath = System.getProperty ("user.dir")+"\\Sources\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", chromepath) ;

		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");

	}

	@Test 
	public void findElementByName() {
	
		WebElement usernameTxt = driver.findElement(By.name("username"));
		WebElement passwordTxt	= driver.findElement(By.name("password"));

		System.out.println(usernameTxt.getLocation());
		System.out.println(passwordTxt.getTagName());
	}

	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}




