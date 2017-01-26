package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DifferentBrowser {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Webdrivers\\IEDriverServer_x64_3.0.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

}
