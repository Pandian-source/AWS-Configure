package B2BApplication;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Xpaths.Loginsearch;

public class Loginandsearch extends Browser
{
	@Test
	public void Openbrowser() throws IOException
	{

		PageFactory.initElements(driver,Loginsearch.class);

		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);


		driver.manage().window().maximize();
		System.out.println("Window maximised");
		String baseUrl = "https://b2bui2.tltid.com/login";
		String expectedTitle = "ClaritySSO - Login";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.contentEquals(expectedTitle))
		{

			System.out.println("Test passed");
		} 
		else 
		{
			System.out.println("Test Failed");

		} 
	}
	@Test
	public void loginbutton() throws InterruptedException
	{	
		WebDriverWait wait =new WebDriverWait(driver,100);
		WebElement submit = wait.until(ExpectedConditions.visibilityOf(Loginsearch.submit));
		String text = submit.getText();
		Loginsearch.submit.click();
		System.out.println(text);
		if(text.contentEquals("Login"))
		{
			System.out.println("Test passed");
		} 
		else 
		{
			System.out.println("Test Failed");

		} }

	@Test
	public void Usenameandpassword() throws IOException
	{
		System.out.println("driver="+driver);
		Loginsearch.username.click();
		System.out.println("username field clicked");
		Loginsearch.username.sendKeys("a.pandian@wintlt.com");
		System.out.println("Username field entered");

		Loginsearch.password.click();
		System.out.println("password field clicked");
		Loginsearch.password.sendKeys("12345S#");
		System.out.println("password field entered");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Loginsearch.Button);
	}

	@Test
	public void settings() throws IOException, InterruptedException
	{	
		Thread.sleep(3000);
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", Loginsearch.settings);
			System.out.println("driver="+driver);

			String Text = Loginsearch.settings.getText();
			System.out.println(Text);

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].click();", Loginsearch.agencyfee);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		WebDriverWait wait =new WebDriverWait(driver,100);
		WebElement Button = wait.until(ExpectedConditions.visibilityOf(Loginsearch.addfee));
		String button = Button.getText();
		System.out.println(button);
		Button.click();

		WebElement Page = wait.until(ExpectedConditions.visibilityOf(Loginsearch.addpage));
		String Header = Page.getText();
		System.out.println(Header);
		
       }
	}




