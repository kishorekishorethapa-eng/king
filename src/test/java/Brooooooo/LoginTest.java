package Brooooooo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	void setTest()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login?utm_source=chatgpt.com");
		driver.manage().window().maximize();
	}
	@Test
	void TestLogin()
	{
		LoginPage lp =new LoginPage(driver);
		lp.setUsername("Admin");
		lp.password("Admin123");
		lp.ClickLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	@AfterClass
	void Down()
	{
		driver.quit();
	}

}
