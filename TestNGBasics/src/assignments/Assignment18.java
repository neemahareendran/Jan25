package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment18 {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dropbox.com");
	}
	@Test(invocationCount=5)
	public void verifyTitle(){
		String actualtitle = "Dropbox";
		String expectedtitle = driver.getTitle();
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("Title of the page is " + actualtitle );
			}
		else {
			driver.close();
		}
	}
    @AfterMethod
		public void closeBrowser(){
			driver.close();
		}
	}


