package gitfacebook02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gitfacebook {
	public String baseUrl="http://www.facebook.com";
	String driverPath="C:\\Users\\RAKHI\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
	public WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching facebook page");
		System.setProperty("webdriver.gecko.driver",driverPath);
	driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	}
	@Test
	public void loginpage() {
		driver.findElement(By.name("email")).sendKeys("rakhi.1534@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("rakhimanoj123");
		driver.findElement(By.name("login")).click();
	}
	@AfterTest
	public void terminateBrowser() {
		driver.close();

	}
}

