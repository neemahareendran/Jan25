package demo;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Assignment17 {
	WebDriver driver;
	
	@BeforeTest
	
	public void openBrowser(){
	 driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://www.barnesandnoble.com/");
	//driver.findElement(By.xpath("html/body/div[3]/div/div/div/section/header/a")).click();
	WebElement Books=driver.findElement(By.linkText("Books"));
	Actions obj= new Actions(driver);
	obj.moveToElement(Books).perform();
	driver.findElement(By.linkText("Biography")).click();
	}
	
	@Test
	public void verifyText(){
		String expected = "Biography";
		String actual = driver.findElement(By.xpath("//*[@id='categoryHeaderContainer']/h1/span[2]/span[2]")).getText();
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void verifyText2(){
		String expected1 = "Bestsellers";
		String actual1 = driver.findElement(By.xpath("//*[@id='hotBooksWithDesc']/h2")).getText();
		Assert.assertEquals(expected1, actual1	);
	}
	@AfterTest
	public void afterTest(){
		driver.close();
	}
	

}
