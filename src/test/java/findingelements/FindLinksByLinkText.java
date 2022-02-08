package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindLinksByLinkText {
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
	public void testLinkPartialText () {
		WebElement seleniumLink = driver.findElement(By.partialLinkText("Elemental Selenium"));
		System.out.println(seleniumLink.getAttribute("href"));
	}
	@Test
	public void testLinkText () {
		WebElement seleniumLink = driver.findElement(By.linkText("Elemental Selenium"));
		System.out.println(seleniumLink.getAttribute("href"));
	}
	@AfterTest
	public void closeDriver () {
		driver.quit();
	}
}