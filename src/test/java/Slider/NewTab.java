package Slider;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTab {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		
		WebElement linkreg = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(linkreg).keyUp(Keys.CONTROL).build().perform();
		List<String> ids= new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).sendKeys("kishore raj");
		
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("iphone");
		driver.close();                                                                                                                             
		
		
		
		
	}

}
