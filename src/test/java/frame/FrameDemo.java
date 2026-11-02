package frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	
	driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
	Thread.sleep(5000);
	 Alert alert=driver.switchTo().alert();
	 alert.accept();
	 driver.switchTo().parentFrame();
	 System.out.println(driver.getTitle());
	 //<iframe frameborder="0" id="iframeResult" name="iframeResult" allowfullscreen="true"></iframe>
	 driver.close();
	}

}
