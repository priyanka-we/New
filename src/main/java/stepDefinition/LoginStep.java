package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStep {
	
	WebDriver driver;
	
	@Given("^User is present on Login Page$")
	public void user_present_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://app-dev.weadmit.io/");
		
	}

	@When("^title of Login Page is WeAdmit$")
	public void title_of_login_page_is_WeAdmit()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("WeAdmit", title);
	}
	
	@Then ("^user enters username and user enters password$")
	public void user_enters_username_and_password()
	{
		driver.findElement(By.id("username")).sendKeys("wstudent");
		driver.findElement(By.id("password")).sendKeys("Cheryl123@");
	}
	
	@Then ("^user clicks on Signin button$")
	public void user_clicks_on_signin_button()
	{
		driver.findElement(By.xpath("//span[text()='SIGN IN']")).click();
	}
	
	@Then ("^user is on Home page$")
	public void user_is_on_home_page()
	{
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("WeAdmit", title1);
	}
	
	@And("^Close the browser$")
	public void close_browser()
	{
		driver.quit();
	}
	
	
	
}
