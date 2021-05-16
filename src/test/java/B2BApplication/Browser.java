package B2BApplication;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Browser {


	public static WebDriver driver;

	@BeforeSuite
	public void browser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);

	}
	@AfterSuite
	public void close() throws InterruptedException
	{   
		driver.close();
		System.out.println("browser closed");

	}


}
