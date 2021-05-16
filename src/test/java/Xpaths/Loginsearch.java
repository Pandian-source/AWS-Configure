package Xpaths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginsearch {
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	public static WebElement submit;
	
	@FindBy(how=How.XPATH, using="//input[@type='text']")
	public static WebElement username;
	
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	public static WebElement password;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	public static WebElement Button;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='From?']")
	public static WebElement origin;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='To?']")
	public static WebElement destination;
	
	@FindBy(how=How.XPATH, using="(//a[@role='button'])[5]")
	public static WebElement settings;

	@FindBy(how=How.XPATH, using="//a[@href='/agencyFeeManagement']")
	public static WebElement agencyfee;
	
	@FindBy(how=How.XPATH, using="//a[@class='createBtn btn btn-primary']")
	public static WebElement addfee;
	
	@FindBy(how=How.XPATH, using="//span[contains(.,'Add Fee Details')]")
	public static WebElement addpage;
}

