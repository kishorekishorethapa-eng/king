package ScrollingDownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/large");
		driver.manage().window().maximize();
		
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,2000)", "");
		
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		WebElement element=driver.findElement(By.xpath("//div[@id='no-siblings']"));
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(5000);
       js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		System.out.println(js.executeScript("return window.pageYOffset;"));


	}

}
