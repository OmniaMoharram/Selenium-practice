package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindByCSSSelector {
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
	public void testFindByCSSselector ()
	{   WebElement headerLbl = driver.findElement(By.cssSelector("h2"));
		WebElement usernametxt = driver.findElement(By.cssSelector("input#username"));
		WebElement passwordtxt = driver.findElement(By.cssSelector("input#password"));
		WebElement loginBtn = driver.findElement(By.cssSelector("button.radius"));
				System.out.println(loginBtn.getText());
				System.out.println(usernametxt.getTagName());
				System.out.println(passwordtxt.getTagName());
				System.out.println(headerLbl.getText());

	}
	@AfterTest
		public void closeDriver() {
			driver.quit();
		}
	}

