package Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions (driver);
		//minimum 
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		System.out.println("Default Location :"+min_slider.getLocation());
		
		act.dragAndDropBy(min_slider, 100, 0).build().perform();
	
		System.out.println("After finding location :"+min_slider.getLocation());
		
		//max
		
              WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		
	     	System.out.println("Default Location :"+max_slider.getLocation());
		
	     	act.dragAndDropBy(max_slider,-100, 0).build().perform();
	     	
		    System.out.println("After finding location :"+max_slider.getLocation());
		
		
		
		
	}

}
