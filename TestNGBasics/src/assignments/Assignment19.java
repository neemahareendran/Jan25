package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment19 {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void testTitle(){
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void verifyText(){
		String actulatext="See photos and updates";
		String expectedtext=driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/div[1]/div[2]/span[1]")).getText();
		Assert.assertEquals(actulatext, expectedtext);
	}
	@Test
	public void verifyText2(){
		String actulatext="It’s free and always will be.";
		String expectedtext=driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/div[1]")).getText();
		Assert.assertEquals(actulatext, expectedtext);
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}
	

}
