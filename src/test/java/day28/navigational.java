package day28;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class navigational {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.chatgpt.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://chatgpt.com/pricing/");
		
		//driver.quit();
		
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
	}

}
