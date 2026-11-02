package Nami;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	
	static void FutureDate(WebDriver driver, String year, String month) {

		while(true)
		{
		String 	currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		String	currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//this is for month and year 
		
		
			}	
		
	}
	
	static void Dates(WebDriver driver ,String date) {
		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for( WebElement dt:allDates) {
			
			if(dt.getText().equals(date))
					{
				dt.click();
				break;
				
			}
			//this is for dates only 
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		
	driver.switchTo().frame(0);//becuase its has only one frame soo 0 index i have taken 
	
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/14/2026");
	
	
	
	String year ="2029";
	String month = "May";
	String date ="20";
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
	
	FutureDate(driver,year,month);
	Dates(driver,date);
	
	
	}
		

	}

