package assignments;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment20 {
	WebDriver driver;
	@BeforeTest
	
	public void openBrowser(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
	}
	@Test
	public void testApp() throws IOException{
		try
		{
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		getScreenshot();
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
		getScreenshot();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")).click();
		getScreenshot();
		driver.findElement(By.name("passFirst0")).sendKeys("Neema");
		driver.findElement(By.name("passLast0")).sendKeys("Sujatha");
		driver.findElement(By.name("creditnumber")).sendKeys("123456");
		getScreenshot();
		driver.findElement(By.name("buyFlights")).click();
		getScreenshot();
		}
		catch(Exception e){
			getScreenshot();
			
		}
		}
		
		
	private void getScreenshot() throws IOException {

	   File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(ss, new File("C:\\Selenium\\Screenshots\\Newtours.jpg"  + new Random().nextInt()+ ".jpg"));
	     
		
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}

}
