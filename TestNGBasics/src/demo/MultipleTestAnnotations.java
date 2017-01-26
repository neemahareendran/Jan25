package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class MultipleTestAnnotations {
	WebDriver driver;
	@BeforeMethod
	
	public void openBrowser(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
}
	@Test(priority=0,invocationCount=5)
	public void verifyTitle(){
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority=2,enabled=false)
	public void verifyText(){
String expectedtext = "See photos and updates";
	    String actualtext = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/div[1]/div[2]/span[1]")).getText();
	    Assert.assertEquals(actualtext, expectedtext);
	}
	@Test(priority=1)
	public void verifyText2(){
		String expectedtext1 = "Sign Up";
	    String actualtext1 = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/h2")).getText();
	    Assert.assertEquals(actualtext1, expectedtext1);
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
}
	