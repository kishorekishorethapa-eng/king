package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		
		WebElement  kishore= driver.findElement(By.xpath("//select[@id='country']"));
		Select kishor =new Select( kishore);
		kishor.selectByVisibleText("China");
		
		List<WebElement>options = kishor.getOptions();
		System.out.println("Number of country are:"+options.size());
	/*	
		for(int i=0; i<options.size();i++) {
System.out.println(options.get(i).getText());			
			
			
			
		}
		
		*/
		for(WebElement op:options)
			
		{
			System.out.println(op.getText());
			
			
		}
		
		
		
		
		
		
		
	}

}
