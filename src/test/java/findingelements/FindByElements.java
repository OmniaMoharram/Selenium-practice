package findingelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindByElements {
	ChromeDriver driver ;

	@BeforeTest

	public void openURL () 
	{
		String chromepath = System.getProperty ("user.dir")+"\\Sources\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", chromepath) ;

		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
	}
@Test 
public void testFindElements () 
{
	//Get all the links displayed on page 
List<WebElement> links = driver.findElements(By.tagName("a"));

//verify there are 20 links displayed on the page 
Assert.assertEquals(46, links.size());
//print each link value
 for (WebElement link : links) {
	 System.out.println( link.getAttribute("href"));
	
}
}

@AfterTest

public void closeDriver () {
driver.quit();
}
}